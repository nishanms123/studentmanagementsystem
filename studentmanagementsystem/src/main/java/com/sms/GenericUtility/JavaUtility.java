package com.sms.GenericUtility;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class JavaUtility {
	public int getRandom()
	{  
		 Random ran=new Random();
		 int random=ran.nextInt(1000);
		 return random;
	}
	public String getSystemDate()
	{
		Date d=new Date();
		String date = d.toString();
		return date;
	}
	public String getSystemDateInFormat()
	{
		SimpleDateFormat dateformat=new SimpleDateFormat("dd/mm/yyy,hh-MM-ss");
		Date d=new Date();
		  String systemdateinformat = dateformat.format(d);
		  return systemdateinformat;
		
	}

}
