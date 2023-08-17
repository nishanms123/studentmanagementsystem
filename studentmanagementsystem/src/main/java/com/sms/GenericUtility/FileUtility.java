package com.sms.GenericUtility;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {
	  public String readDataFromProperty(String key) throws Throwable, IOException
	  {
		  Properties p=new Properties();
		     p.load(new FileInputStream(".\\src\\test\\resources\\data.properties"));
		     String value =p.getProperty(key);
		     return value;
	  }

}
