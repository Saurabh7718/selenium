package Z_A_02_waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class X_02_explicit_wait {

	@Test
	public void explicitWait() {
		WebDriverManager.firefoxdriver().setup();
		
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("https://demo.automationtesting.in/WebTable.html");
		driver.manage().window().maximize();
		WebElement home=driver.findElement(By.xpath("//a[normalize-space()='Home']"));

		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		
		//wait.until(ExpectedConditions.visibilityOf(home));
		wait.until(ExpectedConditions.elementToBeClickable(home));
		home.click();
		
		driver.quit();
	}
}
