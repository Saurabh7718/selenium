package Z_99_practice;

import org.junit.Assert;
import org.testng.annotations.Test;

public class X_28_different_annotation {
	
	@Test(priority=0, groups="sanity1", enabled=false)
	public void testA() {
		System.out.println("test a");
	}
	
	
	@Test(priority=2, dependsOnMethods="testc", groups= {"sanity1","regression"}, invocationCount=2, enabled=false)
	public void testb() {
		System.out.println("test b");
	}
	
	
	@Test(priority=1, enabled=true, groups="regression", invocationCount=3, timeOut=4000)
	public void testc() {
		System.out.println("test c");
 	}
	
	

}
