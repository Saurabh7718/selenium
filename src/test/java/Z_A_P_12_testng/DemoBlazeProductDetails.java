package Z_A_P_12_testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;
import java.util.List;

public class DemoBlazeProductDetails {
    public static void main(String[] args) {
        // Setting up Chrome WebDriver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Navigate to DemoBlaze website
        driver.get("https://www.demoblaze.com/");

         
        // Wait for search results to load
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(5000));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[@class='card-title']")));

        // Extract titles and prices of the phone products
        List<WebElement> productElements = driver.findElements(By.xpath("//h4[@class='card-title']"));
        List<WebElement> priceElements = driver.findElements(By.xpath("//h5[@class='card-title price']"));
        
        System.out.println("Product Details:");
        for (int i = 0; i < productElements.size(); i++) {
            String title = productElements.get(i).getText();
            String price = priceElements.get(i).getText();
            System.out.println("Title: " + title + ", Price: " + price);
        }

        // Close the browser
        driver.quit();
    }
}
