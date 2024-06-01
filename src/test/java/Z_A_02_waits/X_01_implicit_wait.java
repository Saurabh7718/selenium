package Z_A_02_waits;

import org.testng.annotations.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.*;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class X_01_implicit_wait {

	@Test
	public void implicitWait() {
		
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver=new FirefoxDriver();
		
		
		driver.get("https://demo.automationtesting.in/WebTable.html");
		driver.manage().window().maximize();
		
		WebElement practiceSite=driver.findElement(By.xpath("//a[normalize-space()='Practice Site']"));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.quit();
		
		
		
	}
	
}
