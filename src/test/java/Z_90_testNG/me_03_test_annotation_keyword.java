package Z_90_testNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class me_03_test_annotation_keyword {
	/*@BeforeMethod
	void launchBrowser() {
		System.out.println("browser got succesfully launch");
	}
	*/

	

	@Test(priority=2,enabled=false)
	void testB() {
		System.out.println("this is test B");
	}
	
	@Test(priority=1)
	void testA() {
		System.out.println("hello this is test A");

	}

	@Test(priority=0)
	void testC() {
		System.out.println("this is test C");
	}
/*
	@AfterMethod
	void quitBrowser() {
		System.out.println("Browser got closed");
	}
*/
	
}
