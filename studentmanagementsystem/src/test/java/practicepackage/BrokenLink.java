package practicepackage;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLink {
	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.deadlinkcity.com");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		List<WebElement> lisoflinks = driver.findElements(By.xpath("//a"));
		System.out.println(lisoflinks.size());
		ArrayList<String> links=new ArrayList<String>();
		for(int i=0;i<lisoflinks.size();i++)
		{
			String eachlink=lisoflinks.get(i).getAttribute("href");
			URL url=null;
			int status_code=0;
			try {
				url=new URL(eachlink);
				HttpURLConnection httpUrlconncection=(HttpURLConnection)url.openConnection();
				status_code=httpUrlconncection.getResponseCode();
				if(status_code>=400)
				{
					links.add(eachlink+"------>"+status_code);
				}
			}
			catch(Exception e)
			{
				links.add(eachlink+"----->"+status_code);
			}
		}
		System.out.print(links);
	}

}
