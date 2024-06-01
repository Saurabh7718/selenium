package Z_15_broken_links;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class X_01_check_particular_link_is_valid_or_not {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        // wait 10 sec
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));

        // open url
        driver.get("http://www.deadlinkcity.com/");

        WebElement firsturl = driver.findElement(By.xpath("//a[normalize-space()='Errorcode 401']"));

        try {
            String linkUrl = firsturl.getAttribute("href");
            URL url = new URL(linkUrl);

            HttpURLConnection huc = (HttpURLConnection) url.openConnection();

            huc.connect();
            int rescode = huc.getResponseCode();

            if (rescode >= 400) {
                System.out.println(linkUrl + " : broken link");
            } else {
                System.out.println(linkUrl + " : valid link");
            }
        } catch (IOException e) {
            System.out.println(e);
        }

        driver.quit();
    }

}
