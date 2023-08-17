package practicepackage;

import org.testng.annotations.DataProvider;

public class DataProviderExample2Test {
      
	
	@DataProvider
	public Object[][] data()
	{
		Object[][] obj = new Object[3][3];
		obj[0][0]="vk";
		obj[0][1]="ms";
		obj[0][2]="rs";
		
		obj[1][0]="Dl";
		obj[1][1]="Rc";
		obj[1][2]="vc";
		
		obj[2][0]="bmw";
		obj[2][1]="benz";
		obj[2][2]="audi";
		return obj;
		
	}
	@DataProvider
	public Object[][] data1()
	{
		Object[][] obj = new Object[2][3];
		obj[0][0]="eshan";
		obj[0][1]="ya";
		obj[0][2]="nishan";
		
		obj[1][0]="queen";
		obj[1][1]="ace";
		obj[1][2]="king";
		
		return obj;
	}
}
