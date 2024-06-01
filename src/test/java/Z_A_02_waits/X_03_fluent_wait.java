package Z_A_02_waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class X_03_fluent_wait {
	@Test
	public void fluent_wait() throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		WebElement home=driver.findElement(By.xpath("//a[normalize-space()='Home']"));
		
		
		FluentWait<FirefoxDriver> fwait=new FluentWait(driver);
		
		//max time duration
		fwait.withTimeout(Duration.ofSeconds(1000));
		
		//ignore exception
		fwait.ignoring(NullPointerException.class);
		
		//polling every 2 sec
		fwait.pollingEvery(Duration.ofSeconds(2));
		
		fwait.until(ExpectedConditions.visibilityOf(home));
		
		driver.quit();
	}

}
