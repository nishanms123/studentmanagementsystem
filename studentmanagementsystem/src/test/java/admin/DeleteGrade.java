package admin;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import com.sms.GenericUtility.Base_Class;

public class DeleteGrade extends Base_Class {

	 @Test
	 public void deleteGrade() throws Throwable
	 {
		   
		  driver.findElement(By.linkText("Grade")).click();
		  
		  List<WebElement> delete = driver.findElements(By.xpath("//a[@class='confirm-delete btn btn-danger btn-xs']"));
		 WebElement yesbttn = driver.findElement(By.id("btnYes"));
		 
		  
		 
		  for(int i=1;i<=delete.size();i++)
		  { 
			  Thread.sleep(5000);
			  JavascriptExecutor ji=(JavascriptExecutor)driver;
			  ji.executeScript("window.scrollBy(0,3000)","");
			  Thread.sleep(5000);
			  delete.get(i).click();
			  Thread.sleep(5000);
			  yesbttn.click();
			  wib.moveoffset(driver);
		  }
		  for(;;)
		  {
			  driver.findElement(By.xpath("//a[text()='Next']")).click();
			  break;
		  }
	 }
}
