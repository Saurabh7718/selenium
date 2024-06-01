package Z_90_testNG;

import org.testng.asserts.SoftAssert;

public class me_12_assertion1 {

	void mytest() {
		System.out.println("line-1");
		System.out.println("line-2");
		System.out.println("line-3");
		System.out.println("line-4");
		//Assert.assertTrue(false);
		
		SoftAssert sa=new SoftAssert();
		sa.assertTrue(false);
		//sa.assertAll();
		System.out.println("line-5");
		System.out.println("line-6");
		System.out.println("line-7");
		System.out.println("line-8");
		System.out.println("line-9");
		System.out.println("line-10");
		System.out.println("line-11");
		sa.assertAll();
	}

}
