package practicepackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class Getvaluefromdatabase {
	public static void main(String[] args) throws Throwable {
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\Data provider.xlsx");
		           Workbook wb = WorkbookFactory.create(fis);
		  Sheet S = wb.getSheet("Sheet1");
		          for(int i=0;i<=S.getLastRowNum();i++)
		          {
		        	  Row r = S.getRow(i);
		        	  Cell c = r.getCell(0);
		        	  String value = c.getStringCellValue();
		        	  System.out.println(value);
		          }
		          
		
		
	}

}
