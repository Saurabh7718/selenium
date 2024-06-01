package Z_17_read_data_from_file;

import java.io.*;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.google.gson.JsonParser;

public class X_03_2nd_approach_read_data_from_excel_ {
	public static FileInputStream fi;
	public FileOutputStream fo;
	public static XSSFWorkbook workbook;
	public static XSSFSheet sheet;
	public XSSFRow row;
	public XSSFCell cell;
	public CellStyle style;
	String path;

	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		fi=new FileInputStream("D:\\java programs\\SeleniumTraining\\src\\test\\java\\Z_21_Data_driven\\storeData.xlsx");
		workbook=new XSSFWorkbook(fi);
		sheet=workbook.getSheet("sheet1");
		for(Row row:sheet) {
			for(Cell cell:row) {
				 switch (cell.getCellType()) {
                 case STRING:
                     System.out.print(cell.getStringCellValue() + "\t"+" ");
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
			
		
	}

}
