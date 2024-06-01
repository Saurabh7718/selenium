 package Z_09_iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class me_01_how_to_create_iframe {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");

		driver.manage().window().maximize();

		// 1 st frame
		driver.switchTo().frame("packageListFrame");// name of frame
		driver.findElement(By.xpath("//a[normalize-space()='org.openqa.selenium']")).click();
		driver.switchTo().defaultContent();// go back to main page
		Thread.sleep(2000);
		

		// 2nd iframe
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.xpath("//span[normalize-space()='JavascriptExecutor']")).click();
		driver.switchTo().defaultContent();// go back to main page

		// 3rd iframe
		driver.switchTo().frame("classFrame");
		driver.findElement(By.xpath(
				"//div[@class='topNav']//ul[@title='Navigation']//li//a[@href='help-doc.html'][normalize-space()='Help']"))
				.click();
		driver.switchTo().defaultContent();// go back to main page

	}

}
