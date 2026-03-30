package day31;

import java.sql.Connection;
import java.sql.DriverManager;

public class CreateTable {

	public static void main(String[] args) throws Exception
	{
		//Class.forName("com.mysql.cj.jdbc.Driver"); //workbench
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pppdb", "root", "");
		
		System.out.println(con.isClosed());

	}

}
