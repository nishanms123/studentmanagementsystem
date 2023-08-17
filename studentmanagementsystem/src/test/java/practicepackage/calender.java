package practicepackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class calender {
	 
	public static void main(String[] args) throws Throwable {
		int date=25;
		 String MonthAndYear="September 2023";
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);         driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		Actions a=new Actions(driver);
		a.moveByOffset(40,20).click().perform();
		//driver.findElement(By.xpath("//span[@class='logSprite icClose']")).click();
		driver.findElement(By.xpath("//label[@for='departure']")).click();
		
		String actualdate="//div[@aria-label='Thu Oct 12 2023']";
	     String nextArrow="//span[@aria-label='Next Month']";
	     for(;;)
	     {
	    	 try {
	    		 driver.findElement(By.xpath(actualdate)).click();
	    		 break;
	    	 }
	    	 catch(Exception e) {
	    		 driver.findElement(By.xpath(nextArrow)).click();
	    	 }
	     }
//		 driver.findElement(By.xpath("//div[@aria-label='Thu Oct 12 2023']"));
	}
	
	

}
