package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class me_5_css_selectors {
	public static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		// tag and id
		// driver.findElement(By.cssSelector("input#email")).sendKeys("abc@gmail.com");

		// tag and class
		// driver.findElement(By.cssSelector("input.email")).sendKeys("abc@gmail.com");

		// tag and attribute
		//driver.findElement(By.cssSelector("input[name=email]")).sendKeys("abc@gmail.com");

		// tag ,class and attribute
		driver.findElement(By.cssSelector("input.inputtext[name=email]")).sendKeys("abc#gmail.com");
	}
}
