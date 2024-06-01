package Z_99_practice;

import org.testng.annotations.*;

public class X_27_different_test_annotation {

	@BeforeSuite
	public void connection() {
	System.out.println("connection");	
	}
	
	@BeforeTest
	public void environment() {
		System.out.println("environment");	

	}
	
	@BeforeClass
	public void setup() {
		System.out.println("setup");	

	}
	
	@BeforeMethod
	public void method1() {
		System.out.println("method 1");	

	}
	
	@Test
	public void test1() {
		System.out.println("test1");	

	}
	
	@Test
	public void test2() {
		System.out.println("test2");	

		
	}
	
	@AfterMethod
	public void method2() {
		System.out.println("method 2");	

	}
	
	@AfterSuite
	public void connectionClosed() {
	System.out.println("connection closed");	
	}
	
	@AfterTest
	public void environmentClosed() {
		System.out.println("environment closed");	

	}
	
	@AfterClass
	public void setupclose() {
		System.out.println("setup closed");	

	}

}
