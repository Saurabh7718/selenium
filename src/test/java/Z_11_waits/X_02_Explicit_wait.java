package Z_11_waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration; // Corrected import statement

public class X_02_Explicit_wait {

    @Test
    public void test() {
        WebDriverManager.firefoxdriver().setup();

        FirefoxDriver driver = new FirefoxDriver();

        driver.get("https://demo.automationtesting.in/Register.html");
        driver.manage().window().maximize();

		WebElement home=driver.findElement(By.xpath("//a[normalize-space()='Home']"));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5)); // Corrected timeout specification
        
        //wait.until(ExpectedConditions.visibilityOf(home));
        //wait.until(ExpectedConditions.textToBePresentInElement(home, "Home"));
        boolean result=wait.until(ExpectedConditions.titleContains("Register"));
        System.out.println(result);
        driver.quit();
        
        
    }
}
