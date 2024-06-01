package Z_A_06_alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class X_01_alerts_basics {
	
	@Test
	public void alerts_() {
	WebDriverManager.chromedriver().setup();
	
	ChromeDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("https://demo.automationtesting.in/Alerts.html");
	
	driver.findElement(By.xpath("//a[normalize-space()='Alert with OK']")).click();
	
	driver.findElement(By.xpath("//button[contains(text(),'click the button to display an')]")).click();
	
	driver.switchTo().alert().accept();
	
	
	
	
	}
	

}
