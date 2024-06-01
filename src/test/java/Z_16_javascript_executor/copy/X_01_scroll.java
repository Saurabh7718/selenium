package Z_16_javascript_executor.copy;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class X_01_scroll {
	@Test
	public void test() {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://openweathermap.org/api/one-call-3#current");

		JavascriptExecutor j=(JavascriptExecutor)driver;
		
		j.executeScript("window.scrollBy(0,1000)", null);
		
		

	}
}
