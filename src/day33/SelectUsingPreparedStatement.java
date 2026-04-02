package day33;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import day32.HikariDBConnectionPPP;

public class SelectUsingPreparedStatement {

	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		try (Connection con = HikariDBConnectionPPP.getConnection();
				PreparedStatement ps = con.prepareStatement("select salary,ename from emp where salary>=?");) //?=1000
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Amount");
			double a = sc.nextDouble();

			ps.setDouble(1, a);
			
			ResultSet rs = ps.executeQuery();

			while(rs.next())
			{
				//System.out.println(String.format("%-10s %.2f", rs.getString(1), rs.getDouble(2)));
				System.out.println(String.format("%-10s %.2f", rs.getString("ename"), rs.getDouble("salary")));
			}
		} 
		catch (Exception ex1) 
		{
			ex1.printStackTrace();
		}
	}
}
