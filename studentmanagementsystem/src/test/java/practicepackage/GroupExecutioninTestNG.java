package practicepackage;

import org.testng.annotations.Test;

import com.sms.GenericUtility.Base_Class;

public class GroupExecutioninTestNG extends Base_Class {

	  @Test(groups = "regression")
	  public void clss()
	  {
		  System.out.println("create classs"); 
	  }
	  
	  @Test(groups = {"smoke","regression"})
	  public void student()
	  {
		  System.out.println("create student");
	  }
	  
	  @Test(groups="regression")
	  public void grade()
	  {
		  System.out.println("create grade");
	  }
	  @Test(groups="smoke")
	  public void teacher()
	  {
		  System.out.println("create teacher");
	  }
}
