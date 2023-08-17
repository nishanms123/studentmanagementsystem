package practicepackage;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

import com.sms.GenericUtility.IpathConstants;

public class GetDataFromExcel {
      @DataProvider
      public Object[][] getDatafromexcel() throws Throwable
      {
    	  
    	  FileInputStream fis=new FileInputStream(IpathConstants.excelPath);
    	           Workbook book = WorkbookFactory.create(fis);
    	           Sheet sh = book.getSheet("Sheet3");
    	           int lastrow = sh.getLastRowNum();
    	           int lastcell = sh.getRow(0).getLastCellNum();
    	           Object[][] obj=new Object[lastrow+1][lastcell];
    	           for(int i=0;i<=lastrow;i++) //row
    	           {
    	        	   for(int j=0;j<lastcell;j++) //cell
    	        	   {
    	        		   
    	        		   obj[i][j]=sh.getRow(i).getCell(j).toString();
    	        	   }
    	        	   
    	           }
    	           return obj;
      }
      
}
