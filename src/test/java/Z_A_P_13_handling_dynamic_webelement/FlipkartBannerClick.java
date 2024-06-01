package Z_A_P_13_handling_dynamic_webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipkartBannerClick {
	public static void main(String[] args) {
		// Setup Chrome WebDriver
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// Navigate to Flipkart website
		driver.get("https://www.flipkart.com/");

		// click on forward button
		WebElement fbtn = driver.findElement(By.xpath(
				"//*[@id=\"container\"]/div/div[1]/div/div/div/div/div[1]/div/div[1]/div/div[2]/div[1]/div/div[2]/div/div/div/div/div/div/div/button[2]"));

		// Wait for the banner to be clickable
		// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		// WebElement secondBanner =
		// wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"product-2\"]/div/div/div/a/div/img")));
		WebElement secondBanner = driver.findElement(By.xpath("//*[@id=\"product-1\"]/div/div/div/a"));

		//click on fbtn
		fbtn.click();

		// Click on the 2nd banner
		secondBanner.click();

		// Print success message
		System.out.println("Clicked on the 2nd banner successfully.");

		// Close the browser
		driver.quit();
	}
}
