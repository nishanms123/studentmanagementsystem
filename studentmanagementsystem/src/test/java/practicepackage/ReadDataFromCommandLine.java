package practicepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class ReadDataFromCommandLine {
	  @Test
	public void readDataFromCommandLine()
	{    
		String Browser=System.getProperty("browser");
		String URL=System.getProperty("url");
		String Username=System.getProperty("usn");
		String password=System.getProperty("pwd");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);
		driver.findElement(By.name("email")).sendKeys(Username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("//button[@id='btnSubmit']")).click();	
	}

}
