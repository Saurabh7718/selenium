package Z_90_testNG;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class me_16_retrive_logic implements IRetryAnalyzer {
	
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		int count=0;
		int limit=3;
		
		if(count<limit) {
			count++;
			return true;
		}
		return false; 
		
	}

}
