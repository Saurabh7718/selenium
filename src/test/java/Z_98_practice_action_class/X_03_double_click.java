package Z_98_practice_action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class X_03_double_click {
	
	@Test
	public void test() {
		WebDriverManager.firefoxdriver().setup();
		
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		driver.manage().window().maximize();
		
		WebElement webtable=driver.findElement(By.xpath("//a[normalize-space()='WebTable']"));
		
		Actions act=new Actions(driver);
		
		act.doubleClick(webtable).perform();
		
		
	}

}
