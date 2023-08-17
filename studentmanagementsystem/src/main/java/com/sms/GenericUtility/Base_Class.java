package com.sms.GenericUtility;

import java.io.IOException;
import java.sql.SQLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;
import object_repository.Loginpage;

public class Base_Class {
	public DatabaseUtility dib=new DatabaseUtility();
	public ExcelUtility    eib=new ExcelUtility();
	public FileUtility     fib=new FileUtility();
	public JavaUtility     jib=new JavaUtility();
   public WebDriverUtility wib=new WebDriverUtility();
   public static WebDriver driver;
  // public static WebDriver sdriver;
   
  @BeforeSuite(alwaysRun = true)
  public void config_BS() throws SQLException
  {
	  dib.connectdatabase();
	  System.out.println("--connectDataBase--");
  }
  //@Parameters("BROWSER")
  @BeforeClass(alwaysRun = true)
  public void config_BC() throws Throwable
  {
	  String url =fib.readDataFromProperty("URL");
	  String browser =fib.readDataFromProperty("Browser");
	  if(browser.equalsIgnoreCase("chrome"))
      {
    	  WebDriverManager.chromedriver().setup();
    	  driver=new ChromeDriver();
    	 
      } 
      else if(browser.equalsIgnoreCase("edge"))
      {    WebDriverManager.edgedriver().setup();
    	  driver=new EdgeDriver();
      }
      else {
    	  WebDriverManager.firefoxdriver().setup();
    	  driver=new FirefoxDriver();
    	  
      }
	   //sdriver=driver;
	  wib.maximize(driver);
	  wib.pageLoadwait(driver);
	  driver.get(url);

	  System.out.println("---Browser succesfully Launched---");
  }
  
  @BeforeMethod(alwaysRun = true)
  public void config_BM() throws Throwable
  {
	    String Username = fib.readDataFromProperty("username");
	    String Password = fib.readDataFromProperty("password");
	    Loginpage log=new Loginpage(driver);
	              log.login(Username,Password);
	              System.out.println("--succesfully loged in----");
  }
  
  @AfterMethod(alwaysRun = true)
  public void config_AM()
  {
	  Loginpage log=new Loginpage(driver);
	  log.logout();
	  System.out.println("----succesfully loged out---");
  }
  
  @AfterClass(alwaysRun = true)
  public void config_AC()
  {
	 driver.quit();
	  System.out.println("--closed the browser---");
  }
  @AfterSuite(alwaysRun = true)
  public void config_AS() throws Throwable
  {
	  dib.closeJDBC();
  }
   

}
