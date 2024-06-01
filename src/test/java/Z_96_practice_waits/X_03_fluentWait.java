package Z_96_practice_waits;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class X_03_fluentWait {
    
    @Test
    public void test() {
         WebDriverManager.firefoxdriver().setup();

            FirefoxDriver driver = new FirefoxDriver();

            driver.get("https://demo.automationtesting.in/Register.html");
            driver.manage().window().maximize();

            WebElement home = driver.findElement(By.xpath("//a[normalize-space()='Home']"));

            // Declare and initialise a fluent wait
            FluentWait<FirefoxDriver> wait = new FluentWait<>(driver);
            
            // Specify the timeout of the wait
            wait.withTimeout(Duration.ofMillis(5000));
            
            // Specify polling time
            wait.pollingEvery(Duration.ofMillis(250));
            
            // Specify what exceptions to ignore
            wait.ignoring(NoSuchElementException.class);

            // This is how we specify the condition to wait on.
            // This is what we will explore more in this chapter
            wait.until(ExpectedConditions.visibilityOf(home));
            
            
            driver.quit();
    }
}
