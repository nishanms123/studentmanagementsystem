package practicepackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Property_open {
	    static WebDriver driver;
	public static void main(String[] args) throws Throwable {
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\data.properties");
		Properties po=new Properties();
		po.load(fis);
		String url = po.getProperty("URL");
		String browser = po.getProperty("Browser");
		String usn = po.getProperty("username");
		String pwd = po.getProperty("password");
	        WebDriverManager.chromedriver().setup();
	        if(browser.equalsIgnoreCase("chrome"))
	        {
	        	 driver=new ChromeDriver();
	        }else if(browser.equalsIgnoreCase("edge"))
	        {     WebDriverManager.edgedriver().setup();
	        	driver=new EdgeDriver();
	        }else {
	        	driver=new ChromeDriver();
	        }
	        driver.manage().window().maximize();
	        driver.get(url);
	        driver.findElement(By.xpath("//input[@id='email']")).sendKeys(usn);
	        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pwd);
	        driver.findElement(By.xpath("//button[@id='btnSubmit']")).click();
	        Thread.sleep(5000);
	        driver.close();
	        
		
	}

}
