 package Z_90_testNG;

import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class me_15_mylistner implements ITestListener,ISuiteListener {

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("onTeststart method start excuting");
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("on Testsuccess method start excuting");
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("on TestFailure method start excuting");
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("on OntestSkipped method start excuting");
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
		System.out.println("on start method start excuting");
	}
	

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("on finish method  excuting");
	}

}
