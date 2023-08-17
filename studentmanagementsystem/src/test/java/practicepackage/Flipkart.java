package practicepackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkart {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
	      driver.get("https://www.flipkart.com/");
	     // driver.findElement(By.xpath("//button[.='✕']")).click();
	      driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("samsung mobile");
		 driver.findElement(By.xpath("//button[@aria-label='Search for Products, Brands and More']")).click();
		  List<WebElement> links = driver.findElements(By.xpath("//div[@class='_3pLy-c row']//div[@class='_4rR01T']"));
		  List<WebElement> link1 = driver.findElements(By.xpath("//div[@class='_3pLy-c row']//div[@class='col col-5-12 nlI3QM']/descendant::div[@class='_30jeq3 _1_WHN1']"));
		  int count = links.size();
		  System.out.println(count);
		   for(int i=0;i<count;i++) {
			           String name = links.get(i).getText();
			           String name1 = link1.get(i).getText();
			           System.out.println(name+"--------->"+name1);
		   }

}
}