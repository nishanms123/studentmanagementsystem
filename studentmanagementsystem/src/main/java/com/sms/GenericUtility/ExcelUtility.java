package com.sms.GenericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.HashMap;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	/**
	 * this method is used to read the data from excel
	 * @param sheetname
	 * @param rowno
	 * @param cellno
	 * @return
	 * @throws Throwable
	 */
	 public String readDataFromExcel(String sheetname,int rowno,int cellno) throws Throwable
	 {
		    FileInputStream excel_path = new FileInputStream(IpathConstants.excelPath);
		    Workbook book = WorkbookFactory.create(excel_path);
		    String value = book.getSheet(sheetname).getRow(rowno).getCell(cellno).toString();
		    return value;
	 }
	 /**
	  * this method is used to write the data into excel
	  * @param sheetname
	  * @param rowno
	  * @param cellno
	  * @param data
	  * @throws Throwable
	  */
	 public void writeDataIntoExcel(String sheetname,int rowno,int cellno,String data) throws Throwable
	 {
		 FileInputStream excel_path = new FileInputStream(IpathConstants.excelPath);
		 Workbook book = WorkbookFactory.create(excel_path);
		 book.getSheet(sheetname).createRow(rowno).createCell(cellno).setCellValue(data);
		 FileOutputStream fos=new FileOutputStream(IpathConstants.excelPath);
		 book.write(fos);
		   book.close();
	 }
	 /**
	  * this method is used to get last row number of excel sheet
	  * @param sheetname
	  * @return
	  * @throws Throwable
	  */
	  public int getLastRowno(String sheetname) throws Throwable
	  {
		  FileInputStream excel_path = new FileInputStream(IpathConstants.excelPath);
		  Workbook book = WorkbookFactory.create(excel_path);
		         Sheet sheet = book.getSheet(sheetname);
		             int count = sheet.getLastRowNum();
		            return count;
	  }
	  /**
	   * this method is used to fetch the multiple data from the excel
	   * @param sheetname
	   * @param keycolumn
	   * @param valuecolumn
	   * @return
	   * @throws Throwable
	   */
	  public HashMap<String,String> getMultipleData(String sheetname,int keycolumn,int valuecolumn) throws Throwable
	  {
		  FileInputStream excel_path = new FileInputStream(IpathConstants.excelPath);
		  Workbook book = WorkbookFactory.create(excel_path);
		         Sheet sheet = book.getSheet(sheetname);
		             int count = sheet.getLastRowNum();
		  HashMap<String, String> map = new HashMap<String, String>();
		  for(int i=0;i<=count;i++)
		  {
			  String key = sheet.getRow(i).getCell(keycolumn).toString();
			  String value=sheet.getRow(i).getCell(valuecolumn).toString();
			    map.put(key, value);
			    
		  }
		return map;
	  }
public Object[][] getMultipleDataFromExcel(String sheetname) throws Throwable
{
	FileInputStream excel_path = new FileInputStream(IpathConstants.excelPath);
	  Workbook book = WorkbookFactory.create(excel_path);
	  Sheet sheet = book.getSheet(sheetname);
      int lastrow = sheet.getLastRowNum()+1;
      int lastcell=sheet.getRow(0).getLastCellNum();
      Object[][] obj=new Object[lastrow][lastcell];
      for(int i=0;i<lastrow;i++)
      {
    	  for(int j=0;j<lastcell;j++)
    	  {
    		     obj[i][j]=sheet.getRow(i).getCell(j).toString();
    	  }
      }
       return obj;
}
}
