package practicepackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SpiceJet {
	public static void main(String[] args) throws AWTException  {
		
		 WebDriverManager.edgedriver().setup();
		 WebDriver driver=new EdgeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.spicejet.com/");
		 driver.findElement(By.xpath("//div[2][@class='css-1dbjc4n r-1awozwy r-1loqt21 r-18u37iz r-117bsoe r-1otgn73']/div[1][@class='css-1dbjc4n r-zso239']")).click();
		  
		 driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-14lw9ot r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-13awgt0 r-ymttw5 r-tju18j r-5njf8e r-1otgn73' and .='From']")).click();
		 WebElement agartala = driver.findElement(By.xpath("//div[.='Agartala Airport']"));
		 Actions a=new Actions(driver);
		 a.moveToElement(agartala).click().perform();
		 WebElement dest= driver.findElement(By.xpath("//div[.='Aurangabad Airport']"));
		 a.moveToElement(dest).click().perform();
		 WebElement date = driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1mdbw0j r-ymttw5 r-b2dl2 r-mzjzbw r-wk8lta r-tvv088' and @data-testid='undefined-month-August-2023']//div[@class='css-76zvg2 r-homxoj r-adyw6z r-1kfrs79' ]/../following-sibling::div[2][@class='css-1dbjc4n']/descendant::div[@class='css-76zvg2 r-homxoj r-ubezar r-16dba41' and .='19']"));
	     a.moveToElement(date).click().perform();
	     WebElement retur = driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1mdbw0j r-ymttw5 r-b2dl2 r-mzjzbw r-wk8lta r-tvv088' and @data-testid='undefined-month-September-2023']//div[@class='css-76zvg2 r-homxoj r-adyw6z r-1kfrs79' ]/../following-sibling::div[2][@class='css-1dbjc4n']/descendant::div[@class='css-76zvg2 r-homxoj r-ubezar r-16dba41' and .='19']"));
	     a.moveToElement(retur).click().perform();
	     driver.findElement(By.xpath("//div[.='Currency']")).click();
	     /* Robot r=new Robot();
	      r.keyPress(KeyEvent.VK_DOWN);
	      r.keyRelease(KeyEvent.VK_DOWN);
	      r.keyPress(KeyEvent.VK_ENTER);
	      r.keyRelease(KeyEvent.VK_ENTER);*/
	     //WebElement usd = driver.findElement(By.xpath("//div[@class='css-76zvg2 r-homxoj r-ubezar' and .='USD']"));
	    
	     
	     driver.findElement(By.xpath("//div[ .='Family & Friends' and @class='css-76zvg2 r-cqee49 r-1enofrn r-1ozqkpa']/ancestor::div[@class='css-1dbjc4n r-1awozwy r-1loqt21 r-18u37iz r-15d164r r-1otgn73']/div[1][@class='css-1dbjc4n']")).click();
	     driver.findElement(By.xpath("//div[.='Search Flight' and @class='css-76zvg2 r-jwli3a r-1i10wst r-1kfrs79']")).click();
	     
	     
	     
	}
	
	

}
