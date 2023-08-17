package admin;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.sms.GenericUtility.FileUtility;
import com.sms.GenericUtility.WebDriverUtility;

import io.github.bonigarcia.wdm.WebDriverManager;
import object_repository.Loginpage;

public class Open_the_appTest {
	public static void main(String[] args) throws Throwable {
	      FileUtility fis=new FileUtility();
	      WebDriverUtility wib=new WebDriverUtility();
	      String url = fis.readDataFromProperty("URL");
	      String un = fis.readDataFromProperty("username");
	      String pwd = fis.readDataFromProperty("password");
	      String browser = fis.readDataFromProperty("Browser");
	      WebDriver driver;
	      if(browser.equalsIgnoreCase("chrome"))
	      {
	    	  WebDriverManager.chromedriver().setup();
	    	  driver=new ChromeDriver();
	    	  wib.maximize(driver);
	    	  wib.pageLoadwait(driver);
	      } else if(browser.equalsIgnoreCase("edge"))
	      {    WebDriverManager.edgedriver().setup();
	    	  driver=new EdgeDriver();
	      }
	      else {
	    	  WebDriverManager.firefoxdriver().setup();
	    	  driver=new FirefoxDriver();
	    	  
	      }
	      driver.get(url);
	     Loginpage lp=new Loginpage(driver);
	     lp.login(un, pwd);
	 
	}
}
