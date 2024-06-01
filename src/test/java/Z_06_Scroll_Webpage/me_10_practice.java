package Z_06_Scroll_Webpage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class me_10_practice {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        FirefoxDriver driver = new FirefoxDriver();
        
        driver.manage().window().maximize();
        driver.get("https://demo.automationtesting.in/Register.html");
        
        WebElement submit = driver.findElement(By.xpath("//button[@id='submitbtn']"));
        
        // Using Actions class to scroll to the submit button
        Actions act = new Actions(driver);
        act.moveToElement(submit).perform();
        
        // Optionally, you can add a highlight effect to see the element being scrolled to
        ((JavascriptExecutor) driver).executeScript("arguments[0].style.border='3px solid red'", submit);

        Thread.sleep(5000);
        driver.quit();
    }
}
