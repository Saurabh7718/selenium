package Z_90_testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class me_07_timeout_keyword {
	@Test(priority=3,enabled=true,groups="reg")
	void logout() {
		System.out.println("you have log out");
	}
	
	@Test(priority=1,enabled=true,groups="fun",timeOut=3000)
	void login() throws InterruptedException {
		System.out.println("login success");
		Thread.sleep(4000);
		
	}

	@Test(priority=0,groups= {"reg","fun"},dependsOnMethods="login")
	void myaccount() {
		System.out.println("you are under my account page");
	}
}
