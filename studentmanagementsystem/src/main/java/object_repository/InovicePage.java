package object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class InovicePage {
	@FindBy(linkText = "My Son's Payments")
	private WebElement mysonpaymentlink;
	
	@FindBy(xpath="//tr[@class='odd']//a[@class='btn btn-success btn-xs'][normalize-space()='View Invoice']")
	private WebElement invoice;
	
	@FindBy(xpath="//h3[normalize-space()='INVOICE - #1']")
	private WebElement ivoicepage;
	
	@FindBy(xpath="//span[@class='glyphicon glyphicon-remove']")
	private WebElement closeinvoice;
	
	@FindBy(xpath="//tr[@class='odd']//a[@class='btn btn-info btn-xs'][normalize-space()='View Details']")
	private WebElement viewbttn;
	
	@FindBy(xpath="//h3[contains(text(),'Monthly Fee for November')]")
	private WebElement monthfee;
	
	@FindBy(xpath="//div[@class='panel-heading bg-aqua-active']//span[@class='glyphicon glyphicon-remove']")
	private WebElement closeviw;
	
	//Initialization
	public InovicePage(WebDriver driver){
		PageFactory.initElements(driver,this);
	}
	
	//utilization

	public WebElement getMysonpaymentlink() {
		return mysonpaymentlink;
	}

	public WebElement getInvoice() {
		return invoice;
	}

	public WebElement getIvoicepage() {
		return ivoicepage;
	}
	
	public WebElement getCloseinvoice() {
		return closeinvoice;
	}

	public WebElement getViewbttn() {
		return viewbttn;
	}

	public WebElement getMonthfee() {
		return monthfee;
	}

	public WebElement getCloseviw() {
		return closeviw;
	}

	public void mySonpayment(String actualtext)
	{
		mysonpaymentlink.click();
		String text = mysonpaymentlink.getText();
		Assert.assertEquals(actualtext, text);
		/*if(text.equalsIgnoreCase(actualtext)) {
			System.out.println("my payment preview page is displayed");
		}
		else
		{
			System.out.println("my payment preview page is not be displayed");
	
		}*/
	}
	public void ivoiceconfirmation(String invce)
	{     
		// for invoice
		invoice.click();
		String invoce = ivoicepage.getText();
		System.out.println(invoce);
		Assert.assertEquals(invce, invoce);
		/* if(invoce.equalsIgnoreCase(invce))
			{
				System.out.println("invoice page is matching");
			}else {
				System.out.println("invoice page is not matching");

			}*/
		 closeinvoice.click();
	}
	public void viewfee(String fee) throws Throwable
	{
		//for views details
		viewbttn.click();
		String monfee = monthfee.getText();
		//Assert.assertEquals(fee, monfee);
		if(monfee.equalsIgnoreCase(fee)) {
			System.out.println("Monthly Fee for July page is displayed");
		}
		else
		{
			System.out.println("Monthly Fee for July page is not  displayed");
	
		}
		Thread.sleep(5000);
		closeviw.click();
	}

}
