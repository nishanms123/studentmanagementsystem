package practicepackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNgAnnotation {
        
	@BeforeSuite
	public void config_BS()
	{
		System.out.println("----launch JDBC--");
	}
	
	@BeforeClass
	public void launchBorwser()
	{
		System.out.println("----launch browser");
	}
	@BeforeMethod
	public void launchapp()
	{
		System.out.println("----launch application--");
	}
	@Test
	public void test()
	{
		System.out.println("-----execute testscript---");
	}
	@AfterMethod
	public void closeapp()
	{
		System.out.println("----logout from application---");
	}
	@AfterClass
	public void closebrowser()
	{
		System.out.println("----close browser---");
	}
	@AfterSuite
	public void closeJDBC()
	{
		System.out.println("----close databasecnncetion----");
	}
}
