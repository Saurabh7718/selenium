package Z_A_P_15_data_driven;

import org.testng.annotations.Test;

public class test {
    @Test(dataProvider="id", dataProviderClass = Dataproviders.class)
    public void printdata(String id, String petid, String quantity, String shipdate, String status, String complete) {
        System.out.print(id);
        System.out.print(petid);
        System.out.print(quantity);
        System.out.print(shipdate);
        System.out.print(status);
        System.out.print(complete);
        System.out.println();
    }
}  