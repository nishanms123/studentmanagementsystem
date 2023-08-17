package object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TeacherLoginpage {
	@FindBy(name="email")
	private WebElement email;
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(xpath="//button[@id='btnSubmit']")
	private WebElement loginbttn;
	
	//initialization
	public TeacherLoginpage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	//Utilization

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginbttn() {
		return loginbttn;
	}
	//Business libraries
	public void login(String Email,String Password)
	{
		email.sendKeys(Email);
		password.sendKeys(Password);
		loginbttn.click();
	}

}
