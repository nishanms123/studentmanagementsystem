package practicepackage;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.sms.GenericUtility.JavaUtility;

public class Assertiontest {
	
	
	@Test
	public void assertiontest()
	{
		System.out.println("----asasasa---------");
		System.out.println("----quralia---------");
		Assert.assertEquals("sani","rani");
		System.out.println("----santhanad---------");
		System.out.println("----dasdasdas---------");
		
	}
	@Test
	public void softassert()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		String exp = "Facebook – log in or sign up";
		String actual = driver.getTitle();
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(actual,exp);
		System.out.println("------login page sucessfully dispalyed-----");
		soft.assertAll();
	}
	@Test
	public void assertest()
	{
		JavaUtility jib=new JavaUtility();
		            int random = jib.getRandom();
		            SoftAssert s=new SoftAssert();
		            s.assertNotNull(random);
		            System.out.println("---yosup---");
		            s.assertAll();
	}
	

}
