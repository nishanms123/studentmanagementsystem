package practicepackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class matches {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.icc-cricket.com/rankings/mens/team-rankings/t20i");
		 List<WebElement> match = driver.findElements(By.xpath("(//table//tr[*]//td[2]//span[2])[position()<11]"));
		 int count = match.size();
		   for(int i=0;i<count;i++) {
			       String ele = match.get(i).getText();
			       System.out.println(ele);
		   }
}
}
