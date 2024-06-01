package Z_A_01_javascript_executor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class X_06_horizontal_scroller {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		 WebDriverManager.chromedriver().setup();
	        
	        ChromeDriver driver = new ChromeDriver();
	        
	        driver.manage().window().maximize();
	        
	        driver.get("https://demo.automationtesting.in/Register.html");
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        
	        js.executeAsyncScript("window.scrollBy(1000,0)");
	        //js.executeAsyncScript("window.scrollBy(0,-100)");

	       Thread.sleep(5000);
	       driver.quit();

	}

}
