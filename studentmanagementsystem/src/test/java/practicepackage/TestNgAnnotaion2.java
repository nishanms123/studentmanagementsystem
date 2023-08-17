package practicepackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNgAnnotaion2 {
      
	  @BeforeSuite
	  public void connectDataBase()
	  {
		  System.out.println("---connectDataBase---");
	  }
	  @BeforeClass
	  public void openbrowser()
	  {
		  System.out.println("---opne browser---");
	  }
	  @BeforeMethod
	  public void openApp()
	  {
		  System.out.println("---open application---");
	  }
	  @Test
	  public void script()
	  {
		  System.out.println("---executeScript");
	  }
	  @AfterMethod
	  public void closeApp()
	  {
		  System.out.println("---close the application--");
	  }
	  @BeforeMethod
	  public void open_app()
	  {
		  System.out.println("---openaplication");
	  }
	  @Test
	  public void exeuteScript()
	  {
		  System.out.println("----scriptaaaaaa----");
		  
	  }
	 
	  @AfterMethod
	  public void close_app()
	  {
		  System.out.println("---closeappp---");
	  }
	  @AfterClass
	  public void closebrowser()
	  {
		  System.out.println("---closebrowser---");
	  }
	  @AfterSuite
	  public void closeJDBC()
	  {
		  System.out.println("----close JDBC----");
	  }
}
