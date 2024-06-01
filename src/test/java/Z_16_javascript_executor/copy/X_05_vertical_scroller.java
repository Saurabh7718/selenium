package Z_16_javascript_executor.copy;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class X_05_vertical_scroller {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 
        WebDriverManager.chromedriver().setup();
        
        ChromeDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        
        driver.get("https://qodeinteractive.com/magazine/horizontal-scrolling-websites/#square");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        
        js.executeScript("window.scrollBy(0,400)");
        Thread.sleep(4000);
        System.out.println("down");
        js.executeScript("window.scrollBy(0,-200)");
        System.out.println("up");

       Thread.sleep(5000);
       driver.quit();
	}

}
