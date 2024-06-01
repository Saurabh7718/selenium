 package Z_90_testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class me_13_data_providers {

	@DataProvider(name = "datapro")
	String[][] getData() {
		String[][] data = { { "test", "test@123" }, { "" } };
		return data;
	}

	@DataProvider(name = "mydata")
	Object[][] getdata() {
		return new Object[][] { { "username" }, { "password" }, { "click" } };
	}

	

	@Test(dataProvider = "mydata")
	void loginTest(String[] data) {
		System.out.println("set user name= ");
		System.out.println("set password= ");
		
		
	}
	
	@DataProvider(name = "abc")
	Object[][] getDataFromExcel() {
	    // import Apache POI library and read data from Excel
	    // ...
	    // Sample return statement; adjust based on your Excel reading logic
	    return new Object[][] { { "data1", "data2" }, { "data3", "data4" } };
	}

	
}
