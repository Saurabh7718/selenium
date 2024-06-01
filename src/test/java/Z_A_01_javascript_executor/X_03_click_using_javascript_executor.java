package Z_A_01_javascript_executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class X_03_click_using_javascript_executor {
	
	@Test(enabled=false)
	public void argumentsMethod() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Index.html");
		
		WebElement arrow=driver.findElement(By.xpath("//img[@id='enterimg']"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].click",arrow);
		
		Thread.sleep(10000);
		
		driver.quit();
		
		
	}
	@Test(enabled=true)
	public void documentMethod() throws InterruptedException {
		
		//input[@id='checkbox1']
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Index.html");
		
		WebElement arrow=driver.findElement(By.xpath("//img[@id='enterimg']"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("document.getElementByID('enterimg')",arrow);
		
		Thread.sleep(10000);
		
		driver.quit();
	}

}
