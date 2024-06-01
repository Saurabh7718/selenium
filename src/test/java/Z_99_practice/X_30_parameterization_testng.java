package Z_99_practice;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class X_30_parameterization_testng {
	
	@Test
	@Parameters({"a","b"})
	public void parametrization(int a, int b) {
		System.out.println(a);
		System.out.println(b);
		
		
	}

}
