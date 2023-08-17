package practicepackage;

import org.testng.annotations.Test;

public class getDataFromDataProvidedByExcel {

	   @Test(dataProviderClass = GetDataFromExcel.class,dataProvider = "getDatafromexcel")
	   public void getData(String player,String name)
	   {
		   
		   System.out.println(player+"----->"+name);
	   }
}
