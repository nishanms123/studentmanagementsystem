package practicepackage;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExampleTest {
    
	@DataProvider
	public Object[][] data()
	{
	   Object[][] obj=new Object[2][2];
	   obj[0][0]="nishan";
	   obj[0][1]="eshan";
	   
	   
	   obj[1][0]="sani";
	   obj[1][1]="ya";
	   
	   return obj;
	}
	@Test(dataProvider ="data")
	public void getData(String name,String pair) {
		System.out.println(name+"-----"+pair);
		
	}
}
