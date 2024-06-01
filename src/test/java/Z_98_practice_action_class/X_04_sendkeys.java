package Z_98_practice_action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class X_04_sendkeys {
	
	@Test
	
	public void test() throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("https://demo.automationtesting.in/Index.html");
		driver.manage().window().maximize();
		
		WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
		
		Actions act=new Actions(driver);
		Thread.sleep(3000);
		
		act.moveToElement(email).sendKeys("saurabh@gmail.com").build().perform();
		
		driver.quit();
	}

}
