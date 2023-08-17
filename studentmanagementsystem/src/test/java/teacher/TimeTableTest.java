package teacher;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.sms.GenericUtility.ExcelUtility;
import com.sms.GenericUtility.FileUtility;
import com.sms.GenericUtility.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;
import object_repository.TeacherLoginpage;
import object_repository.TimeTablepage;

public class TimeTableTest {
	public static void main(String[] args) throws Throwable {
		FileUtility fip=new FileUtility();
		WebDriverUtility web=new WebDriverUtility();
		ExcelUtility eb=new ExcelUtility();
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
		TeacherLoginpage te=new TeacherLoginpage(driver);
		              te.login(username, PASSWORD);
		    String day = eb.readDataFromExcel("dropdown", 0, 0);
		    String grade = eb.readDataFromExcel("dropdown", 1, 0);
		    String subject = eb.readDataFromExcel("dropdown", 2, 0);
		     String clss = eb.readDataFromExcel("dropdown", 3, 0);
		     String Starttime = eb.readDataFromExcel("dropdown", 4, 0);
		    String Endtime = eb.readDataFromExcel("dropdown", 5, 0);
		             TimeTablepage time=new TimeTablepage(driver);
		             time.clickTimeTable();
		             time.createTimeTable(day,grade,subject,clss,Starttime,Endtime);
		
	}

}

