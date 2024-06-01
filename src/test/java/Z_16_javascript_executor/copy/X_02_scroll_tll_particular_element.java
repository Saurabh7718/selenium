package Z_16_javascript_executor.copy;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class X_02_scroll_tll_particular_element {
	@Test
	public void scrollTillParticularElement() {
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("https://www.countries-ofthe-world.com/");

		driver.manage().window().maximize();
		
		WebElement watch = driver.findElement(By.xpath("//a[normalize-space()='Flags of Europe']"));			
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView();", watch);
		
		
		driver.quit();
	}

}
