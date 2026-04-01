package day32;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) throws Exception
	{
		//Class.forName("com.mysql.cj.jdbc.Driver"); //workbench
//		Class.forName("com.mysql.jdbc.Driver");
//		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pppdb", "root", "");
		Connection con=HikariDBConnectionPPP.getConnection();
		Statement st=con.createStatement();
		
		String query="create table emp3(\r\n"
				+ "eno int(5) primary key,\r\n"
				+ "ename varchar(10) not null,\r\n"
				+ "salary numeric(6,2))";
		
		//Statement st=con.createStatement();
		
		st.execute(query);
		
		System.out.println("Table created");
		st.close();
		con.close();
	}

}
