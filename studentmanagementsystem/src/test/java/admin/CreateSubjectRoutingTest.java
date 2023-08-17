package admin;
import java.io.IOException;
import org.testng.annotations.Test;
import com.sms.GenericUtility.Base_Class;
import object_repository.Classpage;
import object_repository.Gradepage;
import object_repository.Subjectpage;
import object_repository.Subjectroutingpage;
import object_repository.Teacherpage;

public class CreateSubjectRoutingTest extends Base_Class {
	@Test 
	public void createSubject() throws Throwable, IOException {
		
		String format="@gmail.com";
      
		
		int random = jib.getRandom();
		
	   
	      //create class
	         String class_name = eib.readDataFromExcel("Sheet1",0,0)+random;
	         
	         String class_no = eib.readDataFromExcel("Sheet1",0,1);
	         
	         Classpage clss=new Classpage(driver);
	         
	         clss.classroomdetalis(driver,class_name, class_no);
	       
	      
	       //create grade
	      String Grade=eib.readDataFromExcel("grade_Data",0,0)+random;
	     
	      String Addmisson_fee=eib.readDataFromExcel("Grade_Data",0,1);
	      
	      String hall_charge =eib.readDataFromExcel("Grade_Data",0,2); 
	     
	      String range =eib.readDataFromExcel("Grade_Data",0,3);
	     
	      Gradepage grade=new Gradepage(driver);
	     
	      grade.createGrade(Grade,Addmisson_fee,hall_charge);
	     
	      grade.addRange(driver,range, Grade);
	     
	     
	    
	      //create subject
	     String subject =eib.readDataFromExcel("Subject",0,0)+random;
	     
	     Subjectpage sub=new Subjectpage(driver);
	     
	     sub.createSubject(driver,subject);
	     
	    
	     //create teacher
	     String index =eib.readDataFromExcel("Teacher",0,0)+random;
	    
	     String full_name =eib.readDataFromExcel("Teacher",1,0)+random;
	     
	     String intials =eib.readDataFromExcel("Teacher",2,0)+random;
	     
	     String address =eib.readDataFromExcel("Teacher",3,0);
	     
	     String phone = eib.readDataFromExcel("Teacher",4,0);
	     
	     String email =eib.readDataFromExcel("Teacher",5,0)+random+format;
	     
	     String genderDD = eib.readDataFromExcel("Teacher",6,0);
	     
	     String photo= eib.readDataFromExcel("Teacher",7,0);
	     
	     Teacherpage te=new Teacherpage(driver);
	     
	     te.createTeacher(driver,index,full_name,intials,address,genderDD,phone,email,photo);    
	     
	    
	     
	     //create subject routing
	     String Teacher_fee =eib.readDataFromExcel("Teacher",8,0);
	       
	     Subjectroutingpage subr=new Subjectroutingpage(driver);
	     
	     subr.createSubjectrouting(driver,Grade,subject,full_name,Teacher_fee);
	       
	      
	       
	    
	    
	}

}
