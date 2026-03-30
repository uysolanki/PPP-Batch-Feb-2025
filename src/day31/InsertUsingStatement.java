package day31;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertUsingStatement {

	public static void main(String[] args) throws ClassNotFoundException 
	{
	Class.forName("com.mysql.jdbc.Driver");
	try(
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pppdb", "root", "");
		Statement st=con.createStatement();)
	{
			
		String query="insert into emp values(1,'Alice',800.00)";
		
		int rows=st.executeUpdate(query);
		if(rows>0)
			System.out.println(rows + " Records Inserted");
	}
	catch(Exception ex1) {}
	}
}
