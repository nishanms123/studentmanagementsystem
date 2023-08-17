package practicepackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Icc {
           public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();
			 WebDriver driver=new ChromeDriver();
			 driver.get("https://www.icc-cricket.com/rankings/mens/team-rankings/t20i");
			 List<WebElement> link = driver.findElements(By.xpath("//span[.='Matches']/ancestor::tr/ancestor::table//tbody/tr/td[1]"));
			 List<WebElement> link1 = driver.findElements(By.xpath("//span[.='Matches']/ancestor::tr/ancestor::table//tbody/tr/td[2]"));
			 List<WebElement> link2 = driver.findElements(By.xpath("//span[.='Matches']/ancestor::tr/ancestor::table//tbody/tr/td[3]"));
			 List<WebElement> link3 = driver.findElements(By.xpath("//span[.='Matches']/ancestor::tr/ancestor::table//tbody/tr/td[4]"));
			 List<WebElement> link4 = driver.findElements(By.xpath("//span[.='Matches']/ancestor::tr/ancestor::table//tbody/tr/td[5]"));
			   int count = link.size();
			   System.out.println("pos    team      match      point      rating     ");
			   for(int i=0;i<count;i++) {
				           String name = link1.get(i).getText();
				             String num = link.get(i).getText();
				             String match= link2.get(i).getText();
				             String point = link3.get(i).getText();
				             String rating = link4.get(i).getText();
			 	             
			  System.out.println(num+"    "+name+"    "+match+"    "+point+"    "+rating);
			   }
			    
			    
		}
}
