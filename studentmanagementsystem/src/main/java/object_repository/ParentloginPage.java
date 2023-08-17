package object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ParentloginPage {
	@FindBy(id="email")
	private WebElement parentUN;
	
	@FindBy(id="password")
	private WebElement parentpwd;
	
	@FindBy(id="btnSubmit")
	private WebElement submitt;
	
	
	//Initialization
	public ParentloginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	//utilization

	public WebElement getParentUN() {
		return parentUN;
	}

	public WebElement getParentpwd() {
		return parentpwd;
	}

	public WebElement getSubmitt() {
		return submitt;
	}
	
	public void login(String Email,String Password)
	{
		parentUN.sendKeys(Email);
		parentpwd.sendKeys(Password);
		submitt.click();
	}
	public void parentloginconfirmation(WebDriver driver,String title)
	{
		String ele = driver.getTitle();
  		if(ele.equalsIgnoreCase(title)) {
 			System.out.println("login succesfully");
 			
 		}else {
 			System.out.println("email or password is incorrect");
 		}
	}
	

}
