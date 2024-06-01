package Z_90_testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class me_02_2lecture {
	@BeforeSuite
	void dbConnect() {
		System.out.println("db connection");
	}
	
	@BeforeTest
	void environmentsetup() {
		System.out.println("environment setup");
	}

	@BeforeClass
	void setup() {
		System.out.println("setup sccesss");

	}

	@BeforeMethod
	void launchBrowser() {
		System.out.println("browser got succesfully launch");
	}

	@Test
	void testA() {
		System.out.println("hello this is my tets");

	}

	@Test
	void testB() {
		System.out.println("this is test B");
	}

	@Test
	void testC() {
		System.out.println("this is test C");
	}

	@AfterMethod
	void quitBrowser() {
		System.out.println("Browser got closed");
	}

	@AfterClass
	void setupclose() {
		System.out.println("setupclose");
	}

	@AfterTest
	void environmentsetupClose() {
		System.out.println("environment setup");
	}
	
	@AfterSuite
	void dbDisConnect() {
		System.out.println("db connection closed");
	}
}


