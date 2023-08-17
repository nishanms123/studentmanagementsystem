package practicepackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Apple_iPhone {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.amazon.in");
		 driver.findElement(By.xpath("//input[@class='nav-input nav-progressive-attribute' and @id='twotabsearchtextbox']")).sendKeys("iphone");
		 driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		 List<WebElement> m_name = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal'] "));
		 List<WebElement> price = driver.findElements(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']//span[@class='a-price-whole']"));
		  int count = m_name.size();
		   for(int i=0;i<count;i++) {
			           String name = m_name.get(i).getText();
			           String price1=price.get(i).getText();
			           System.out.println(name+"-------->"+price1);
		   }
	}

}
