package object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sms.GenericUtility.WebDriverUtility;

public class TimeTablepage extends WebDriverUtility {
   @FindBy(xpath="//span[text()='Timetable']")
   private WebElement timetablelink;
   
   @FindBy(xpath="//a[text()=' My Timetable']")
   private WebElement mytimetablelink;
   
   @FindBy(xpath="//a[@class='btn btn-success btn-xs']")
   private WebElement addbtn;
   
   @FindBy(id="day")
   private WebElement daydropdown;
   
   @FindBy(xpath="//select[@name='grade_id']")
   private WebElement gradedropdown;
   
   @FindBy(xpath="//select[@id='subject']")
   private WebElement subjectdropdown;
   
   @FindBy(xpath="//select[@id='classroom']")
   private WebElement classdropdown;
   
   @FindBy(xpath="//input[@id='start_time']")
   private WebElement starttime;
   
   @FindBy(xpath="//input[@id='end_time']")
   private WebElement endtime;
   
   @FindBy(xpath="//button[@id='btnSubmit']")
   private WebElement submitt;
   
   
   //initialization
  public TimeTablepage(WebDriver driver){
	   
	  PageFactory.initElements(driver,this);
   }
  //utilization

public WebElement getTimetablelink() {
	return timetablelink;
}

public WebElement getMytimetablelink() {
	return mytimetablelink;
}

public WebElement getAddbtn() {
	return addbtn;
}

public WebElement getDaydropdown() {
	return daydropdown;
}

public WebElement getGradedropdown() {
	return gradedropdown;
}

public WebElement getSubjectdropdown() {
	return subjectdropdown;
}

public WebElement getClassdropdown() {
	return classdropdown;
}

public WebElement getStarttime() {
	return starttime;
}

public WebElement getEndtime() {
	return endtime;
}
  public WebElement getSubmitt() {
	return submitt;
}

//business libraries
public void clickTimeTable() {
	timetablelink.click();
	mytimetablelink.click();
	addbtn.click();
}
public void createTimeTable(String day,String grade,String subject,String clss,String Starttime,String Endtime)
{
	selectByvisible(daydropdown, day);
	selectByvisible(gradedropdown, grade);
	selectByvisible(subjectdropdown, subject);
	selectByvisible(classdropdown, clss);
	starttime.sendKeys(Starttime);
	endtime.sendKeys(Endtime);
	submitt.click();
}
   
   
}
