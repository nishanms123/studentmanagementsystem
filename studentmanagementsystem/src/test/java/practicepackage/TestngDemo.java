package practicepackage;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestngDemo {
     
	@Test(priority=2,enabled = false)
     public void greeting()
     {
    	 System.out.println("-----yo sup---");
     }
        @Test(priority = 1)
     public void replaying()
     {
    	 System.out.println("---nothing much----");
    	 
     }
        @Test(priority=3,dependsOnMethods = "data1")
     public void listing()
     {
    	 System.out.println("---yeah good-----");
     }
}
