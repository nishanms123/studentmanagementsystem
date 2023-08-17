package parent;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.sms.GenericUtility.Base_Class;
import object_repository.InovicePage;
import object_repository.ParentloginPage;
@Listeners(com.sms.GenericUtility.Listener_implemantation.class)
public class MyPaymentandinvoiceTest extends Base_Class {
	
	@Test
	public  void myPaymentAndInvoiceTest() throws Throwable {
		
		String Email = fib.readDataFromProperty("email");
		String Password =fib.readDataFromProperty("password");
		
		ParentloginPage p=new ParentloginPage(driver);
		p.login(Email, Password);
 		
	      Assert.fail();
		InovicePage in=new InovicePage(driver);
		String actualtext = "My Son's Payments";
		in.mySonpayment(actualtext);
		// for invoice
		 		//wib.getScreenShot(driver, "screen");
				String invce = "INVOICE - #1";
				in.ivoiceconfirmation(invce);
				//for views details
				 String fee = "Monthly Fee for November";
				in.viewfee(fee);
				 
				
			}
				
			}

