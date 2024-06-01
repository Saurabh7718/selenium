package Z_98_practice_action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class X_06_customized_list_box {
	@Test
	public void cutomized_list_box() throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();

		FirefoxDriver driver=new FirefoxDriver();

		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		WebElement interactions=driver.findElement(By.xpath("//a[normalize-space()='Interactions']"));
		
		Actions act=new Actions(driver);
		
		//act.moveToElement(interactions).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).build().perform();
		
		 
		
		 act.moveToElement(interactions).sendKeys(Keys.ENTER).build().perform();
		
		Thread.sleep(3000);
		

		
		driver.quit();
	}
}
