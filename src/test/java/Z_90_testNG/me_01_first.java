package Z_90_testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class me_01_first {
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
	}@Test
	void testD() {
		System.out.println("this is test D");
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
		System.out.println("environment setup closed");
	}
}
