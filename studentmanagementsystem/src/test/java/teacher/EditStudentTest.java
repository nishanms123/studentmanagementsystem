package teacher;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import com.sms.GenericUtility.FileUtility;
import com.sms.GenericUtility.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class EditStudentTest {
	    public static void main(String[] args) throws Throwable {
	    	FileUtility fip=new FileUtility();
			WebDriverUtility web=new WebDriverUtility();
			String BROWSER=fip.readDataFromProperty("Browser");
			String URL=fip.readDataFromProperty("URL");
			String username=fip.readDataFromProperty("email1");
			String PASSWORD=fip.readDataFromProperty("password1");	
	WebDriver driver;
	if(BROWSER.equalsIgnoreCase("chrome"))
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		web.maximize(driver);;
		web.pageLoadwait(driver);;

	}
	else
	{WebDriverManager.chromedriver().setup();
	driver=new EdgeDriver();
	}
	driver.get(URL);
	driver.findElement(By.name("email")).sendKeys(username);
	driver.findElement(By.name("password")).sendKeys(PASSWORD);
	driver.findElement(By.xpath("//button[@id='btnSubmit']")).click();
driver.findElement(By.xpath("//span[text()='My Student']")).click();
WebElement dropdown=driver.findElement(By.xpath("//select[@id='grade']"));
web.selectByvisible(dropdown, "Grade 1");
driver.findElement(By.xpath("//button[text()='Submit']")).click();
}
}
