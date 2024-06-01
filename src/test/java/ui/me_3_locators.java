package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class me_3_locators {
	public static String browser = "chrome";// External configuration- XML,CSV
	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (browser.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup(); 
			driver = new ChromeDriver();
		}

		driver.get("https://www.saucedemo.com/");

		// driver.get("https://www.selenium.dev/");

		// find element by using locators

		// driver.findElement(By.id("user-name")).sendKeys("Testing");
		// driver.findElement(By.className("form_input")).sendKeys("Testing");
		// driver.findElement(By.cssSelector("driver.findElement(By.className(\"form_input\")).sendKeys(\"Testing\");")).sendKeys("Testing");
		// driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[1]/div/form/div[1]/input")).sendKeys("Testing");
		// driver.findElement(By.tagName("input")).sendKeys("Testing");
		// driver.findElement(By.className("form_input")).sendKeys("Testing");

		driver.findElement(By.linkText("downloads")).click();
		driver.findElement(By.partialLinkText("downloads")).click();

		// driver.findElement(By.id("user-name")).sendKeys("standard_user");

		driver.findElement(By.id("user-name")).sendKeys("testing");
		driver.close();
	}

}
