package com.sms.GenericUtility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class DatabaseUtility {
	Connection con=null;
	public void connectdatabase() throws SQLException
	{
		Driver driver=new Driver();
		 DriverManager.registerDriver(driver);
		 con = DriverManager.getConnection(IpathConstants.dbUrl,IpathConstants.dbUsn,IpathConstants.dbPwd);
	}
	public void selectQuery(String query,int columnno,String expdata) throws SQLException
	{
		   Statement state = con.createStatement();
		   ResultSet result = state.executeQuery(query);
		   boolean flag=false;
		   while(result.next())
		   {
			        String actual = result.getString(columnno); 
			        if(actual.equalsIgnoreCase(expdata)) {
			        	flag=true;
			        	break;
			        }
		   }
		   if(flag==true) {
			   System.out.println("datas are mtching");
		   }else
		   {
			   System.err.println("datas are not matching");
		   }
	}
	public void closeJDBC() throws Throwable
	{
		con.close();
	}

}
