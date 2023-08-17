package object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	@FindBy(name = "email")
	private WebElement username;
	@FindBy(name="password")
	private WebElement password;
	@FindBy(xpath="//button[@id='btnSubmit']")
	private WebElement login_button;
	@FindBy(xpath="//span[text()='Ingenious Developer1']")
	private WebElement developerbttn;
	
	@FindBy(xpath="//a[text()='Sign out']")
	private WebElement signoutbttn;
	
	//intialization
	public Loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
         //Utilization
	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getButton() {
		return login_button;
	}
	
	public WebElement getDeveloperbttn() {
		return developerbttn;
	}
	public WebElement getSignoutbttn() {
		return signoutbttn;
	}
	//business libraries
	public void login(String un,String pwd)
	{
		username.sendKeys(un);
		password.sendKeys(pwd);
		login_button.click();
	}
	
	public void logout()
	{
		developerbttn.click();
		signoutbttn.click();
	}

}
