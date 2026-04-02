package day33;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

import day32.HikariDBConnectionPPP;

public class DeleteUsingPreparedStatement {

	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		try (Connection con = HikariDBConnectionPPP.getConnection();
				PreparedStatement ps = con.prepareStatement("delete from emp where eno=?");) 
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter emp number");
			int a = sc.nextInt();

			ps.setInt(1, a);
			
			int rows = ps.executeUpdate();

			if (rows > 0)
				System.out.println(rows + " Records Deleted");
		} 
		catch (Exception ex1) 
		{
			ex1.printStackTrace();
		}
	}
}
