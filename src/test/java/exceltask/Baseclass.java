package exceltask;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.collect.Table.Cell;

public class Baseclass {
	
static	WebDriver dr;
	
	static public void launch(String s) {
System.setProperty("webdriver.chrome.driver", "D:\\spartan\\studies\\j2ee application\\Testng\\drivers\\chromedriver.exe");
dr =new ChromeDriver();
dr.get(s);
dr.manage().window().maximize();
dr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

}
	
static 	public String files(int a,int b) throws IOException {
		File f=new File("C:\\Users\\shalom daniel\\eclipse-workspace\\Exceltask\\excel\\form2.xlsx");
		FileInputStream fi=new FileInputStream(f);
		Workbook w=new XSSFWorkbook(fi);
		Sheet s = w.getSheet("form");
		Row r = s.getRow(a);
	org.apache.poi.ss.usermodel.Cell c = r.getCell(b);
	String str = c.getStringCellValue();
	return str;
	
		
	}
static public void  fill(WebElement w,String s)
{
	w.sendKeys(s);
}
}
