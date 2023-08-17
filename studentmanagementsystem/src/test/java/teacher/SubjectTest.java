package teacher;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import com.sms.GenericUtility.FileUtility;
import com.sms.GenericUtility.JavaUtility;
import com.sms.GenericUtility.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SubjectTest {
	 public static void main(String[] args) throws InterruptedException, Throwable {
		 FileUtility fip=new FileUtility();
			WebDriverUtility web=new WebDriverUtility();
			JavaUtility jav=new JavaUtility();
			int random = jav.getRandom();
			String BROWSER=fip.readDataFromProperty("Browser");
			String URL=fip.readDataFromProperty("URL");
			String username=fip.readDataFromProperty("email1");
			String PASSWORD=fip.readDataFromProperty("password1");
			WebDriver driver;
			if(BROWSER.equalsIgnoreCase("chrome"))
			{
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
				web.maximize(driver);
				web.pageLoadwait(driver);
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
	driver.findElement(By.xpath("//a[@class='btn btn-info btn-xs']")).click();
	WebElement element=driver.findElement(By.xpath("//input[@id='email']"));
	element.sendKeys(Keys.CONTROL+"a");
	element.sendKeys(Keys.DELETE);
	Thread.sleep(1000);
	String email="9916Little";
	element.sendKeys(email+random+"@gmail.com");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[@id='btnSubmit']")).click();


		}
}
