package exceltask;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class Sample {
	public static void main(String[] args) throws Exception {
		
	
	File f=new File("C:\\Users\\shalom daniel\\eclipse-workspace\\Exceltask\\excel\\Book1.xls");
	FileInputStream fi=new FileInputStream(f);
	Workbook w=new HSSFWorkbook(fi);
	Sheet s = w.getSheet("Sheet1");
	Row r = s.getRow(0);
	Cell c = r.getCell(0);
	System.out.println(c);
	}

}
