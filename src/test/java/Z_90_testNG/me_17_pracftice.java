 package Z_90_testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class me_17_pracftice {
	WebDriver driver;

	@BeforeClass
	@Parameters("b")
	void browser(String b) {
		if(b.equalsIgnoreCase("Edge")) {
			
		
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();	
		}
	}
	
	
	@Test(priority=2,groups="sanity")
	void testA() {
		System.out.println("tetsA");
	}
	
	@Test(priority=0,enabled=false,groups={"sanity","func"})
	void testB() {
		System.out.println("tetsB");
	}
	
	@Test(priority=1,invocationCount=1,timeOut=3000)
	void testC() throws InterruptedException {
		System.out.println("tetsC");
		Thread.sleep(5000);

	}
}
