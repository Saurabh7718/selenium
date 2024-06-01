package Z_99_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class X_07_select_class {
    
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://demo.automationtesting.in/Register.html");
        WebElement skills = driver.findElement(By.xpath("//select[@id='Skills']"));
        
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
        
        Select select = new Select(skills);
     //   select.selectByValue("C");
     //  select.selectByVisibleText("C++");
        
        
        
       
        select.selectByIndex(5);
        
        Thread.sleep(4000);
       // Select select1 = new Select(skills);
        //select1.deselectByIndex(1);
        
        
        Thread.sleep(4000);
        
        driver.close();
    }

}
