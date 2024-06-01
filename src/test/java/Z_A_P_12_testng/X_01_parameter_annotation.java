package Z_A_P_12_testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class X_01_parameter_annotation {
    @Test
    @Parameters({"a","b"})
    public void ConcatString(String a, String b) {
        String str=a+b;
        System.out.println(str);
    }
}
