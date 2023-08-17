package practicepackage;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.sms.GenericUtility.ExcelUtility;

public class GetDataFromExcelUsingGenericDataProvider {
	
	@Test(dataProvider = "getDataFromExcel")
	public void getData(String key,String name)
	{
		System.out.println(key+"-------->"+name);
	}
	
	@DataProvider
	public Object[][] getDataFromExcel() throws Throwable
	{
		ExcelUtility elib=new ExcelUtility();
		  Object[][] value = elib.getMultipleDataFromExcel("Student2");
		  return value;
	}

}
