package parent;

import org.testng.annotations.Test;
import com.sms.GenericUtility.Base_Class;
import object_repository.ParentloginPage;

	public class StudentLoginTest extends Base_Class {
		    
		@Test
	public  void studentLogin() throws Throwable {
		
			String Email = fib.readDataFromProperty("email");
			String Password =fib.readDataFromProperty("password");
		
			String title = "Student Management System";
			ParentloginPage p=new ParentloginPage(driver);
			p.login(Email, Password);
	 		p.parentloginconfirmation(driver, title);
	 		//driver.close();	
		}
	}
		
