package Z_A_01_javascript_executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class X_08_pracrice_all {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.javatpoint.com/exception-handling-in-java");
		
		driver.manage().window().maximize();
		
		WebElement e=driver.findElement(By.xpath("//h2[normalize-space()='Java Exception Keywords']"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView()", e);
		
		
	//	js.executeScript("window.scrollBy(0,1000)");
		
		Thread.sleep(4000);
		
		driver.quit();
		
		
	}
 
}
