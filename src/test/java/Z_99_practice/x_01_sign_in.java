package Z_99_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class x_01_sign_in {
    static WebDriver driver;

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("https://demo.automationtesting.in/Index.html");
        String title = driver.getTitle();
        
        // Check if the title contains the text "Index"
        Assert.assertTrue(title.contains("Index"), "Page title does not contain 'Index'");

        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("saurabh@gmail.com");

        // Add any other actions or assertions as needed

        // Close the browser
        driver.quit();
    }
}
