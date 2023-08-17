package admin;

import java.io.IOException;
import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.sms.GenericUtility.Base_Class;
import object_repository.Gradepage;
import object_repository.Studentpreviewpage;
import object_repository.Subjectpage;
import object_repository.Subjectroutingpage;

public class CreateStudentDetailsTest extends Base_Class {
	@Test
	public  void createStudent() throws Throwable, IOException {	
		String Grade;
		String e_format = "@gmail.com";
	
	      int random = jib.getRandom();
	      
	       //create Grade
	      Grade =eib.readDataFromExcel("Grade",0,1)+random;
	      String Addmisson_fee =eib.readDataFromExcel("Grade",1,1);
	      String hall_charge=eib.readDataFromExcel("Grade",2,1);
	      String range =eib.readDataFromExcel("Grade",3,1);
	      Gradepage gr=new Gradepage(driver);
	      gr.createGrade(Grade, Addmisson_fee, hall_charge);
	      gr.addRange(driver,range, Grade);
	       	     // create subject
	       	String subject =eib.readDataFromExcel("Subject",0,0)+random;
	 	    
	       	Subjectpage sub=new Subjectpage(driver);
	   	    
	       	sub.createSubject(driver,subject);
	 	    
	       	// create subject routing
	 	
		      String Teacher_fee =eib.readDataFromExcel("Teacher",8,0);
		      String Teacher_name =eib.readDataFromExcel("Teacher",1,0);
		      
		       Subjectroutingpage sr=new Subjectroutingpage(driver);
		       sr.createSubjectrouting(driver,Grade, subject, Teacher_name, Teacher_fee);
		      
		       //create student
	 	        
	 	   HashMap<String, String> value = eib.getMultipleData("Student2",0,1);
	 	      
	 	      String S_email =eib.readDataFromExcel("Student",0,1)+random+e_format;
	 	      
	 	      String G_email =eib.readDataFromExcel("Student",1,1)+random+e_format;
	 	      
	 	      String S_photo=eib.readDataFromExcel("Student",4,1);
	 	      
	 	      String genderDD=eib.readDataFromExcel("Student",3,1);
	 	      
	 	      Studentpreviewpage st=new Studentpreviewpage(driver);
	 	      
	 	      st.createStudent(driver,value, S_email, G_email,S_photo,genderDD,jib);
	 	     Assert.fail();
	 	      st.confirm(Grade);
	 	      } 
}
