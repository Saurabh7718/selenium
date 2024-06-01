package Z_90_testNG;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class me_14_listeners {
	@BeforeSuite
	void setup() {
		System.out.println("Test setup started");
	}

	@AfterSuite
	void closeSetup() {
		System.out.println("setup closed successfully");
	}
	
	@BeforeMethod
	void login() {
		System.out.println(" login succssfull");
	}
	
	@AfterMethod
	void logout() {
		System.out.println("logout sucess");
	}
	
	@Test(priority=1)
	void homepageTest() {
		System.out.println("home page test successfull");
		Assert.fail();
	} 
	
	@Test(priority=2)
	void productpagetest() {
		System.out.println("product  page test successfull");
	}
	
	

}
