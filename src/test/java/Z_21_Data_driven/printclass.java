  package Z_21_Data_driven;

import org.testng.annotations.Test;

 
public class printclass {
    @Test(dataProvider = "Data", dataProviderClass = dataProviders.class)
    public void print(String id, String petId, String shipdate, String quantity, String status, String complete) {
        System.out.print(id+"\t");
        System.out.print(shipdate+"\t");
        System.out.print(status+"\t");
        System.out.println("");
    }
}
