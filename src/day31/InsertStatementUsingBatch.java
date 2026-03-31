package day31;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertStatementUsingBatch {

	public static void main(String[] args) throws ClassNotFoundException 
	{
	Class.forName("com.mysql.jdbc.Driver");
	try(
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pppdb", "root", "");
		Statement st=con.createStatement();)
	{
			
		String query1="insert into emp values(4,'Vedant',800.00)";
		String query2="insert into emp values(5,'Nitin',900.00)";
		String query3="insert into emp values(6,'Anil',1000.00)";
		String query4="insert into emp values(7,'Akanksha',1100.00)";
		String query5="insert into emp values(8,'Pooja',1200.00)";
		//String query6="delete from emp where sal>=1100";
		
		st.addBatch(query1);
		st.addBatch(query2);
		st.addBatch(query3);
		st.addBatch(query4);
		st.addBatch(query5);
		//st.addBatch(query6);
		
		int rows[]=st.executeBatch();
		
			System.out.println(rows.length + " Records Inserted");
	}
	catch(Exception ex1) {}
	}
}
