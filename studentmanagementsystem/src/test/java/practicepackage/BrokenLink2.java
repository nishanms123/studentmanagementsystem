package practicepackage;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLink2 {
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.amazon.in");
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		List<WebElement> listoflinks = driver.findElements(By.xpath("//a"));
		ArrayList<String> list=new ArrayList<String>();
		for(int i=0;i<listoflinks.size();i++)
		{
			String eachlink = listoflinks.get(i).getAttribute("href");
			URL url=null;
			int Statuscode=0;
			try
			{
				url=new URL(eachlink);
				HttpURLConnection httpurlconnection=(HttpURLConnection)url.openConnection();
				Statuscode=httpurlconnection.getResponseCode();
				if(Statuscode>=400)
				{
					list.add(eachlink+"----->"+Statuscode);
				}
			}
			catch(Exception e){
				list.add(eachlink+"----->"+Statuscode);
			}
		}
		System.out.println(list);
	}

}
