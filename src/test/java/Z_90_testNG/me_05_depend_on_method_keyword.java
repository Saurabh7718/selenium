package Z_90_testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class me_05_depend_on_method_keyword {
	@Test(priority=3,enabled=true,groups="reg")
	void logout() {
		System.out.println("you have log out");
	}
	
	@Test(priority=1,enabled=true,groups="fun")
	void login() {
		System.out.println("login success");
		//Assert.fail();
	}

	@Test(priority=0,groups= {"reg","fun"},dependsOnMethods="login")
	void myaccount() {
		System.out.println("you are under my account page");
	}
}
