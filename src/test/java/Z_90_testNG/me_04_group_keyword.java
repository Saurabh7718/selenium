package Z_90_testNG;

import org.testng.annotations.Test;

public class me_04_group_keyword {
	@Test(priority=2,enabled=true,groups="reg")
	void testB() {
		System.out.println("this is test B");
	}
	
	@Test(priority=1,groups="fun")
	void testA() {
		System.out.println("hello this is test A");

	}

	@Test(priority=0,groups= {"reg","fun"})
	void testC() {
		System.out.println("this is test C");
	}
}
