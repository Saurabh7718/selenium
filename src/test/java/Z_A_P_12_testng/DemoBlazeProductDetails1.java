package Z_A_P_12_testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.*;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;
import java.util.List;

public class DemoBlazeProductDetails1 {
    public static void main(String[] args) {
        // Setting up Chrome WebDriver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Navigate to DemoBlaze website
        driver.get("https://www.demoblaze.com/");

        // Wait for search results to load
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[5]/div/div[2]/div/div[1]/div/div/h4")));

        
        Map<String,String> map=new HashMap<String,String>();
        
        
        // Extract titles and prices of the phone products
        List<WebElement> productElements = driver.findElements(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div/h4"));
        List<WebElement> priceElements = driver.findElements(By.xpath("/html/body/div[5]/div/div[2]/div/div/div/div/h5"));
        
        // Check if elements are found
        if (productElements.size() == 0 || priceElements.size() == 0) {
            System.out.println("No products found.");
        } else {
            System.out.println("Product Details:");
            for (int i = 0; i < Math.min(productElements.size(), priceElements.size()); i++) {
                String title = productElements.get(i).getText();
                String price = priceElements.get(i).getText();
                System.out.println("Title: " + title + ", Price: " + price);
                map.put(title, price);
            }
        }

        // Close the browser
        
        
        System.out.println("map print");
        for(Map.Entry<String, String> m:map.entrySet()) {
        	
        	System.out.println(m.getValue()+"  "+m.getKey());
        	
        }
        
        driver.quit();
    }
}
