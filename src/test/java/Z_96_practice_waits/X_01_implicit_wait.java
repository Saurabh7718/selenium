package Z_96_practice_waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class X_01_implicit_wait {
	@Test
	public void test() {
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		WebElement home=driver.findElement(By.xpath("//a[normalize-space()='Home']"));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		// isDisplayed() , isEnabled(), isSelected()
		boolean result=home.isDisplayed();
		System.out.println(result);
		
		driver.quit();
	}

}
