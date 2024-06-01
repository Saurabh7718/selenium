package Z_90_testNG;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class me_11_Assertion {

	// TODO Auto-generated method stub
	WebDriver driver;
	SoftAssert sa;

	@BeforeTest
	@Parameters("browser")
	void setup(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} else if (browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		}
	}

	@BeforeClass
	@Parameters("url")
	void launchURL(String url) {
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		sa = new SoftAssert();
	}

	@Test(priority = 2, dependsOnMethods = "urltest")
	void logotest() {
		WebElement logo = driver.findElement(By.xpath(" //body/div[3]/a[1]/i[1]"));
		boolean status = logo.isDisplayed();
		// Assert.assertEquals(status,"true" );
//		Assert.assertTrue(status, "logo test is successfull");
//		Assert.assertFalse(status, "logo is not visible");

		sa.assertTrue(status, "logo test is passed");

	}

	@Test(priority = 3)
	void firstTryItUrSelfTest() {
		driver.findElement(By.xpath(" //body/div[@id='main']/div[3]/div[1]/div[2]/div[1]/a[1]")).click();
		String parentwin = driver.getWindowHandle();
		Set<String> allwin = driver.getWindowHandles();

		// switch to child window
		for (String childwin : allwin) {

			if (!childwin.equalsIgnoreCase(parentwin)) {
				driver.switchTo().window(childwin);

				WebElement iframeone = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
				driver.switchTo().frame(iframeone);

				WebElement text = driver.findElement(By.xpath("//h1"));
				System.out.println(text.getText());
				driver.close();
				driver.switchTo().window(parentwin);
			}
		}
	}

	@Test(priority = 4)
	void secondTryItUrSelfTest() {
		driver.findElement(By.xpath("//body/div[@id='main']/div[4]/div[1]/div[2]/div[1]/a[1]")).click();
		String parentwin = driver.getWindowHandle();
		Set<String> allwin = driver.getWindowHandles();

		// switch to child window
		for (String childwin : allwin) {

			if (!childwin.equalsIgnoreCase(parentwin)) {
				driver.switchTo().window(childwin);

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
//	@Parameters("url")
	void urltest(String url) {
		String actualurl = driver.getCurrentUrl();
		sa.assertEquals(actualurl, "https://www.w3schools.co", "this test is passed");

	}

	@AfterClass
	void closeBrowser() {
		driver.quit();
	}
}
