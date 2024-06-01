package Z_22_auto_suggestion;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class X_01_handle_auto_suggestion {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.amazon.in/");

		WebElement searchbar = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchbar.sendKeys("mobile");

		// Explicit wait for auto-suggestions to appear
		Thread.sleep(2000);

		// Find all auto-suggestion elements
		List<WebElement> autosuggestions = driver
				.findElements(By.xpath("//header[@id='navbar-main']/div/div[2]/div/div/div/div"));

		// Print and click on each auto-suggestion
		for (WebElement suggestion : autosuggestions) {
			String text = suggestion.getText();
			System.out.println(text);
			Thread.sleep(1000);
			try {
			if (text.equals("mobile 5g")) {
				Actions act = new Actions(driver);
				System.out.println("click");
				
				
					act.moveToElement(suggestion);
					act.sendKeys(Keys.PAGE_DOWN).click().build().perform();

					Thread.sleep(4000);
					break;
				}
			}
				
				catch (Exception e) {
					e.printStackTrace();
					System.out.println("skip try block");
				}
			}
		

		Thread.sleep(7000);
		driver.quit();
	}
}
