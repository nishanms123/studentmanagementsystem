package practicepackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class AddDataintoTable {
    public static void main(String[] args) throws SQLException {
		Driver driver=new Driver();
		DriverManager.registerDriver(driver);
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/nishan","root","root");
		           Statement state = con.createStatement();
		              String query= "insert into sani values('eshanya',5676567,'esnya@gmail.com'),('sahnnn',12344,'dfg3455');";
		               int result = state.executeUpdate(query);
		              System.out.println(result);
		              
	}
}
