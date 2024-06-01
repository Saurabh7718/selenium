package Z_21_Data_driven;

import java.io.IOException;
import org.testng.annotations.DataProvider;

public class dataProviders {

    @DataProvider(name = "Data")
    public Object[][] getAllData() throws IOException {
        String path = "D:\\java programs\\SeleniumTraining\\src\\test\\java\\Z_21_Data_driven\\storeData.xlsx";
        XLUtility xl = new XLUtility(path);

        int rownum = xl.getRowCount("Sheet1");
        int colcount = xl.getCellCount("Sheet1", 1);

        Object[][] apidata = new Object[rownum][colcount];

        for (int i = 1; i <= rownum; i++) {
            for (int j = 0; j < colcount; j++) {
                apidata[i - 1][j] = xl.cellData("Sheet1", i, j);
            }
        }

        return apidata; 
    }
}
