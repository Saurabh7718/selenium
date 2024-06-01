package Z_98_practice_action_class;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
public class X_01_moveToElement {
	
	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		
		FirefoxDriver driver=new FirefoxDriver();
	
		
		driver.get("https://demo.automationtesting.in/Windows.html");
		
		driver.manage().window().maximize();
		
		WebElement switchTo=driver.findElement(By.xpath("//a[normalize-space()='SwitchTo']"));
		WebElement alerts=driver.findElement(By.xpath("//a[normalize-space()='Alerts']"));
		switchTo.click();
		
		Actions act=new Actions(driver);
		act.moveToElement(alerts).click().build().perform();
	}

}
