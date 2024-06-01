package Z_98_practice_action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class X_02_context_click {
	
	@Test
	public void test() {
		
		WebDriverManager.firefoxdriver().setup();
		
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		WebElement cart=driver.findElement(By.xpath("//a[@title='Cart']"));
		
		Actions act=new Actions(driver);
		
		act.contextClick(cart).perform();
		
	}
	

}
