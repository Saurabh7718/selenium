package Z_A_P_11_windowHandles;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class X_04_separate_multiple_windows {

    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://demo.automationtesting.in/Windows.html");

        String originalWindow = driver.getWindowHandle();
        // click on open multiple separate windows

        driver.findElement(By.xpath("//a[normalize-space()='Open Seperate Multiple Windows']")).click();

        // button to open multiple windows
        driver.findElement(By.xpath("//button[@onclick='multiwindow()']")).click();

        Thread.sleep(2000);
        // open new tab and click on arrow
        driver.findElement(By.xpath("//img[@id='enterimg']")).click();

        // Wait for new window to open
        WebDriverWait wait = new  WebDriverWait(driver, Duration.ofMillis(10000));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));

        Set<String> handles = driver.getWindowHandles();
        Thread.sleep(2000);
        for (String handle : handles) {
            String title = driver.switchTo().window(handle).getTitle();
            System.out.println(title);
        }

        // Switch back to original window
        driver.switchTo().window(originalWindow);

        Thread.sleep(4000);
        driver.quit();
    }
}
