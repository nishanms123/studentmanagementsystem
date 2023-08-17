package practicepackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Team_match {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.icc-cricket.com/rankings/mens/team-rankings/t20i");
		 List<WebElement> matches = driver.findElements(By.xpath("//span[.='Matches']/ancestor::table//tr//td[3][@class='table-body__cell u-center-text' and text()>30]"));
		 List<WebElement> team = driver.findElements(By.xpath("(//span[.='Matches']/ancestor::table//tr//td[2]//span[@class='u-hide-phablet'])[position()<15]"));
		 for(int i=0;i<matches.size();i++)
		 {
			   String ma = matches.get(i).getText();
			     String tea = team.get(i).getText();
			     System.out.println(tea+"------->"+ma);
		 }
	}

}
