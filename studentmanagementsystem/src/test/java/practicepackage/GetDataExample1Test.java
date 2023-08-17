package practicepackage;

import org.testng.annotations.Test;

public class GetDataExample1Test {
    
	@Test(priority=1,dataProviderClass = DataProviderExample2Test.class,dataProvider = "data")
	public void getData1(String name,String name1,String name2)
	{
		System.out.println(name+"-------"+name1+"------"+name2);
	}
	
	
	@Test(priority=2,dataProviderClass = DataProviderExample2Test.class,dataProvider = "data1")
     public void geData2(String name,String name2,String name3)
     {
    	 System.out.println(name+"------"+name2+"------"+name3);
     }
}
