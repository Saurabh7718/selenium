package Z_23_relative_locators;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

public class X_01_above {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        try {
            driver.get("https://www.website.com/sign-in/?source=SC&country=IN");

            // Using WebDriverWait to ensure the page is fully loaded
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            // Locate the username field
            WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='username']")));
            System.out.println("Username field found");

            // Locate the password field which is above the username field
            WebElement password = wait.until(ExpectedConditions.presenceOfElementLocated(with(By.tagName("input")).above(username)));
            System.out.println("Password field found");

            // Check if the password field is visible and interactable
            if (password.isDisplayed() && password.isEnabled()) {
                // Interact with the fields
                username.sendKeys("abc");
                password.sendKeys("abc@123");

                // Pause for a while to observe the actions
                Thread.sleep(4000);
            } else {
                System.out.println("Password field is not interactable");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Quit the driver
            driver.quit();
        }
    }
}
