package day31;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTableTryWithResources {

	public static void main(String[] args) throws ClassNotFoundException 
	{
	Class.forName("com.mysql.jdbc.Driver");
	try(
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pppdb", "root", "");
		Statement st=con.createStatement();)
	{
			
		String query="create table emp1(\r\n"
				+ "eno int(5) primary key,\r\n"
				+ "ename varchar(10) not null,\r\n"
				+ "salary numeric(6,2))";
		
		//Statement st=con.createStatement();
		
		st.execute(query);
		
		System.out.println("Table created");
	}
	catch(Exception ex1) {}
	}
}
