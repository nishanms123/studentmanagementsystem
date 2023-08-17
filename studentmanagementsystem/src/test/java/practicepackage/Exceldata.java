package practicepackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.sms.GenericUtility.IpathConstants;

public class Exceldata {

	public static void main(String[] args) throws Throwable {
		FileInputStream fis=new FileInputStream(IpathConstants.excelPath);
        Workbook book = WorkbookFactory.create(fis);
        Sheet sh = book.getSheet("Sheet3");
        int lastrow = sh.getLastRowNum();
        int lastcell = sh.getRow(0).getLastCellNum();
        System.out.println(lastrow+" "+lastcell);
	}
}
