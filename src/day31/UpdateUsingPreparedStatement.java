package day31;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateUsingPreparedStatement {

	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		try (Connection con = MySQLDBConnectionPPP.getDBConnection();
				PreparedStatement ps = con.prepareStatement("update emp set salary=salary+500 where eno=?");) 
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter emp number");
			int a = sc.nextInt();

			ps.setInt(1, a);
			
			int rows = ps.executeUpdate();

			if (rows > 0)
				System.out.println(rows + " Records Updated");
		} 
		catch (Exception ex1) 
		{
			ex1.printStackTrace();
		}
	}
}
