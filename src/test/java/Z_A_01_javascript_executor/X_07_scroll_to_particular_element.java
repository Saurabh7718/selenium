package Z_A_01_javascript_executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class X_07_scroll_to_particular_element {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		////div[contains(@class,'qodef-market-latest-themes-holder')]
		
WebDriverManager.chromedriver().setup();
        
        ChromeDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        
        driver.get("https://qodeinteractive.com/magazine/horizontal-scrolling-websites/#square");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement title=driver.findElement(By.xpath("//div[contains(@class,'qodef-market-latest-themes-holder')]"));
        js.executeScript("arguments[0].scrollIntoView()",title);
        Thread.sleep(4000);
        
       Thread.sleep(5000);
       driver.quit();

	}

}
