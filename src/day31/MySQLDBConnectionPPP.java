package day31;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySQLDBConnectionPPP {

	public static Connection getDBConnection() throws Exception
	{
		String driverName="com.mysql.jdbc.Driver";
		String dbUrl="jdbc:mysql://localhost:3306/pppdb";
		String userName="root";
		String userPassword="";
		
		Class.forName(driverName);
		Connection con = DriverManager.getConnection(dbUrl,userName ,userPassword);
		return con;
	}
}
