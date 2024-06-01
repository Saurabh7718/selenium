package Z_A_P_15_data_driven;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class Dataproviders {

    @DataProvider(name="id")
    public Object[][] apidata() throws IOException{
        String path="D:\\java programs\\SeleniumTraining\\src\\test\\java\\Z_A_P_15_data_driven\\storeData.xlsx";
        XLUtility utility=new XLUtility(path);
        int row=utility.rownumber("Sheet1");
        int cellnum=utility.cellnumber("Sheet1", 1);
        
        Object[][] obj=new Object[row][cellnum];
        
        for(int i=1; i<=row; i++) {
            for(int j=0; j<cellnum; j++) {
                obj[i-1][j]=utility.getvalue("Sheet1", i, j);
            }
        }
        
        return obj;
    }
}
