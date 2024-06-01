package Z_17_read_data_from_file;
import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
public class X_02_read_data_from_excel_file {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 try (FileInputStream fis = new FileInputStream(new File("D:\\java programs\\SeleniumTraining\\src\\test\\java\\Z_17_read_data_from_file\\storeData.xlsx"));
	             Workbook workbook = WorkbookFactory.create(fis)) {

	            // Get the first sheet
	            Sheet sheet = workbook.getSheetAt(0);

	            // Iterate through each row
	            for (Row row : sheet) {
	                // Iterate through each cell in the row
	                for (Cell cell : row) {
	                    // Print the cell value
	                    switch (cell.getCellType()) {
	                        case STRING:
	                            System.out.print(cell.getStringCellValue() + "\t");
	                            break;
	                        case NUMERIC:
	                            System.out.print(cell.getNumericCellValue() + "\t");
	                            break;
	                        case BOOLEAN:
	                            System.out.print(cell.getBooleanCellValue() + "\t");
	                            break;
	                        default:
	                            System.out.print("\t");
	                    }
	                }
	                System.out.println();
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	}

}
