package object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sms.GenericUtility.WebDriverUtility;

public class Classpage extends WebDriverUtility  {
	@FindBy(linkText = "Classroom")
	private WebElement clssroomlink;
	
	@FindBy(xpath="//input[@id='name']")
	private WebElement classname;
	
	@FindBy(xpath = "//input[@id='student_count']")
	private WebElement studentcount;
	
	@FindBy(xpath="//button[@id='btnSubmit']")
	private WebElement submit;
	
	//intialization
	   public Classpage(WebDriver driver) {
		   
		   PageFactory.initElements(driver, this);
	}
	   //utilization
	   public WebElement getClssroomlink() {
			return clssroomlink;
		}  
	public WebElement getClassname() {
		return classname;
	}

	public WebElement getStudentcount() {
		return studentcount;
	}
	public WebElement getSubmit() {
		return submit;
	}
	//business libraries
	
	public void classroomdetalis(WebDriver driver,String class_name,String class_no)
	{    
	
		clssroomlink.click();
		classname.sendKeys(class_name);
		studentcount.sendKeys(class_no);
		submit.click();
		moveoffset(driver);
	}
	   

}
