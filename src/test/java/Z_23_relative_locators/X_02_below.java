package Z_23_relative_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

public class X_02_below {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Add implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        try {
            driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

            // Verify the actual placeholder attribute value
            WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
            System.out.println("Password field located.");

            // Locate the username field which is above the password field
            WebElement username = driver.findElement(with(By.tagName("input")).above(password));
            System.out.println("Username field located.");

            // Interact with the located elements
            username.sendKeys("admin");
            Thread.sleep(3000);

            password.sendKeys("admin123");

            // Pause for a while to observe the actions
            Thread.sleep(3000);

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("An error occurred in the try block.");
        } finally {
            // Quit the driver
            driver.quit();
        }
    }
}
