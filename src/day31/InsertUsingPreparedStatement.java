package day31;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class InsertUsingPreparedStatement {

	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pppdb", "root", "");
				PreparedStatement ps = con.prepareStatement("insert into emp values(?,?,?)");) 
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter emp number");
			int a = sc.nextInt();

			System.out.println("Enter emp name");
			String b = sc.next();

			System.out.println("Enter emp salary");
			double c = sc.nextDouble();

			ps.setInt(1, a);
			ps.setString(2, b);
			ps.setDouble(3, c);

			int rows = ps.executeUpdate();

			if (rows > 0)
				System.out.println(rows + " Records Inserted");

		} 
		catch (Exception ex1) 
		{
			ex1.printStackTrace();
		}
		AutoCloseable
	}
}
