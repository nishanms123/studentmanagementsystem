package practicepackage;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Databasedata {
	public static void main(String[] args) throws Throwable {
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\Data provider.xlsx");
		           Workbook book = WorkbookFactory.create(fis);
		             book.getSheet("Sheet1").createRow(0).createCell(0).setCellValue("asfafas");
		             FileOutputStream fos=new FileOutputStream(".\\\\src\\\\test\\\\resources\\\\Data provider.xlsx");
		             book.write(fos);
		             book.close();
	}

}
