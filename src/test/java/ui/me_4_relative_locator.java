package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class me_4_relative_locator {
	public static String browser="chrome";
	public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		driver.findElement(RelativeLocator.with(By.tagName("input")).above(By.id("password"))).sendKeys("Testing");
		driver.findElement(RelativeLocator.with(By.tagName("login")).below(By.id("password"))).click();
			
	}

}
