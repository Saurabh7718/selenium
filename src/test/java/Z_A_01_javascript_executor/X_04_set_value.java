package Z_A_01_javascript_executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class X_04_set_value {
    public static void main(String[] args) throws InterruptedException {
        
        WebDriverManager.chromedriver().setup();
        
        ChromeDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        
        driver.get("https://demo.automationtesting.in/Register.html");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        
        WebElement name = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
        js.executeScript("arguments[0].setAttribute('attr','sam')", name);
        Thread.sleep(3000);
        driver.quit();    
    }
}
