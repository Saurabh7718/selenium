package Z_31_Test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Z_30_pageObjects.HomePageObjects;
import Z_30_pageObjects.SearchProducts;
import io.github.bonigarcia.wdm.WebDriverManager;

public class me_01_homePageTest {
	WebDriver driver;  
	HomePageObjects hpo;
	SearchProducts sppo;
	@BeforeSuite
	void initSetup() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();

	}

	@BeforeTest
	void launchUrl() { 
		driver.get(" https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}
	
	@BeforeClass
	void initObjs() {
		hpo= new HomePageObjects(driver);
		sppo=new SearchProducts(driver);
	}

	@Test(priority = 1)
	void urlTest() {
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl,
				" https://www.amazon.in/s?k=amazon+com&hvadid=73049094732142&hvbmt=be&hvdev=c&hvqmt=e&tag=msndeskstdin-21&ref=pd_sl_4cc5demh34_e",
				"url is correct");

	}

	@Test(priority = 2)
	void logoTest() {
		
		boolean actualLogo = hpo.isLogoPresent();
		Assert.assertTrue(actualLogo, "logo test is successfull !");
		hpo.cart();
	}

	@Test(priority=3)
	void searchBarTest() { 
		boolean searchBarFlag=hpo.isSearchBarPresent();
		Assert.assertTrue(searchBarFlag,"search field is displayong on home page");
		
		hpo.setsearchBarField("shirts");
		Assert.assertTrue(hpo.isSearchIconPresent(), "Search icon is present");
		hpo.clickSearchIcon();
		
		sppo.validateHeaderPage("Results");
		sppo.clickFirstProducts();
	}

	@AfterClass
	void closeBrowser() throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(10000);
		driver.quit();
	}

}
