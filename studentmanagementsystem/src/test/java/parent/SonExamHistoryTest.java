package parent;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.sms.GenericUtility.Base_Class;
@Listeners(com.sms.GenericUtility.Listener_implemantation.class)
public class SonExamHistoryTest extends Base_Class{
	
	   @Test
	public  void sonExam() throws Throwable {
	 
		driver.findElement(By.id("email")).sendKeys("dad1@gmail.com");
		driver.findElement(By.id("password")).sendKeys("12345");
		driver.findElement(By.id("btnSubmit")).click();
		String ele = driver.getTitle();
		System.out.println(ele);
  		if(ele.equalsIgnoreCase("Student Management System")) {
 			System.out.println("login succesfully");
 			
 		}else {
 			System.out.println("email or password is incorrect");
 		}
		driver.findElement(By.xpath("//span[normalize-space()='Exam']")).click();
		String Exam = driver.findElement(By.xpath("//ul[@class='treeview-menu menu-open']")).getText();
		System.out.println(Exam);
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[@href='my_sons_exam_marks_history.php']")).click();
		Thread.sleep(2000);
		WebElement selectyear = driver.findElement(By.xpath("//select[@id='year']"));
		Select sel=new Select(selectyear);
		sel.selectByVisibleText("2017");
		WebElement selectexam = driver.findElement(By.xpath("//select[@id='exam']"));
		Select sel1=new Select(selectexam);
		sel1.selectByVisibleText("Term 1");
		driver.findElement(By.id("btnSubmit")).click();
		String Exammarks = driver.findElement(By.xpath("//h2[normalize-space()='2017 - Term 1 Exam']")).getText();
		if(Exammarks.equalsIgnoreCase("2017 - Term 1 Exam")) {
			
			System.out.println("2017 - Term 1 Exam result should be displyed");
			
		}
		else
		{
			System.out.println("2017 - Term 1 Exam result should not be displyed");
		}
		
		
		driver.close();
		
	
}}
