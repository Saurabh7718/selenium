package Z_17_read_data_from_file;

import java.io.*;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class X_04_practice {
	 
	public static void main(String[] args) throws IOException, ParseException {
		// TODO Auto-generated method stub
		
		JSONParser jsonparser=new JSONParser();
		JSONObject obj=(JSONObject) jsonparser.parse(new FileReader("D:\\java programs\\SeleniumTraining\\src\\test\\java\\Z_17_read_data_from_file\\file.json"));
		
		String name=(String) obj.get("city");
		
		System.out.println(name);
	}
}
