package Z_90_testNG;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class me_08_prcatice_withKeywordInRealApp {
	WebDriver driver;

	@BeforeTest
	void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}

	@BeforeClass
	void launchURL() {
		driver.get("https://www.w3schools.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@Test(priority = 2, dependsOnMethods = "urltest")
	void logotest() {
		WebElement logo = driver.findElement(By.xpath(" //body/div[3]/a[1]/i[1]"));
		if (logo.isDisplayed()) {
			System.out.println("logo present");
		} else {
			System.out.println("logo is not present");
		}
	}

	@Test(priority = 3)
	void firstTryItUrSelfTest() {
		driver.findElement(By.xpath(" //body/div[@id='main']/div[3]/div[1]/div[2]/div[1]/a[1]")).click();
		String parentwin = driver.getWindowHandle();
		Set<String> allwin = driver.getWindowHandles();

		// switch to child window
		for (String childwin : allwin) {

			if (!childwin.equalsIgnoreCase(parentwin)) {
				driver.switchTo().window( childwin);
				
				WebElement iframeone = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
				driver.switchTo().frame(iframeone);

				WebElement text = driver.findElement(By.xpath("//h1"));
				System.out.println(text.getText());
				driver.close();
				driver.switchTo().window(parentwin);
			}
		}
	}
	@Test(priority=4)
	void secondTryItUrSelfTest() {
		driver.findElement(By.xpath("//body/div[@id='main']/div[4]/div[1]/div[2]/div[1]/a[1]")).click();
		String parentwin = driver.getWindowHandle();
		Set<String> allwin = driver.getWindowHandles();

		// switch to child window
		for (String childwin : allwin) {

			if (!childwin.equalsIgnoreCase(parentwin)) {
				driver.switchTo().window( childwin);
				
				WebElement iframeone = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
				driver.switchTo().frame(iframeone);

				WebElement text = driver.findElement(By.xpath("//h1"));
				System.out.println(text.getText());
				driver.close();
				driver.switchTo().window(parentwin);
			}
		}
	}

	@Test(priority = 1)
	void urltest() {
		String url = driver.getCurrentUrl();
		if (url.equalsIgnoreCase("https://www.w3schools.com/")) {
			System.out.println("url test is pass true");
		} else {
			System.out.println("url test is failed false");
		}
	}

	@AfterClass
	void closeBrowser() {
		driver.quit();
	}
}
