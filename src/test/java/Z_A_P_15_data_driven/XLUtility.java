package Z_A_P_15_data_driven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLUtility {

    public String path;
    public static XSSFWorkbook workbook;
    public static XSSFSheet sheet;
    public static Row row;
    public static Cell cell;
    
    public XLUtility(String path) {
        this.path = path;
    }
    
    public int rownumber(String sheetname) throws IOException {
        FileInputStream fi = new FileInputStream(path);
        workbook = new XSSFWorkbook(fi);
        sheet = workbook.getSheet(sheetname);
        
        return sheet.getLastRowNum();
    }
    
    public int cellnumber(String sheetname, int rownum) throws IOException {
        FileInputStream fi = new FileInputStream(path);
        workbook = new XSSFWorkbook(fi);
        sheet = workbook.getSheet(sheetname);
        row = sheet.getRow(rownum);
        return row.getLastCellNum();
    }
    
    public String getvalue(String sheetname, int rownum, int cellnum) throws FileNotFoundException {
        FileInputStream fi = new FileInputStream(path);
        try {
            workbook = new XSSFWorkbook(fi);
        } catch (IOException e) {
            e.printStackTrace();
        }
        sheet = workbook.getSheet(sheetname);
        row = sheet.getRow(rownum);
        cell = row.getCell(cellnum);
        DataFormatter formatter = new DataFormatter();
        return formatter.formatCellValue(cell);
    }
}
