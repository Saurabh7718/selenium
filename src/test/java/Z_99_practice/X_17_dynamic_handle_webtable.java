package Z_99_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class X_17_dynamic_handle_webtable {

    public static void main(String[] args) {
        // Setup ChromeDriver
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");

        // Find the number of table headers
        int headCount = driver.findElements(By.xpath("//*[@id='post-body-1325137018292710854']/div/div/div[5]/table/thead/tr/th"))
                .size();

        System.out.println("Printing headers");
        // Loop through the headers
        for (int i = 1; i <= headCount; i++) {
            String header = driver.findElement(By.xpath(
                    "//*[@id='post-body-1325137018292710854']/div/div/div[5]/table/thead/tr/th[" + i + "]")).getText();

            System.out.println(header);
        }
        
        for(int i=0;i<=10;i++) {
        	for(int j=0;j<=10;j++) {
        		String data=driver.findElement(By.xpath("//*[@id=\"post-body-1325137018292710854\"]/div[1]/div[1]/div[5]/table/tbody/tr["+i+"]/td["+j+"]")).getText();
        		System.out.println(data);
        	}
        }
        driver.quit();
    }
}
