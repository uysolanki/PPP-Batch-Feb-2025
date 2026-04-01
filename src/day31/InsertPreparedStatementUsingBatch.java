package day31;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertPreparedStatementUsingBatch {

	public static void main(String[] args)  throws ClassNotFoundException, SQLException
	{
		try
		{
		insertBatch();
		}
		catch(MyException ex1)
		{
			System.out.println("Message to Customer "+ex1.getMessage());
		}
	}

	private static void insertBatch() throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.jdbc.Driver");
		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pppdb", "root", "");
				PreparedStatement ps = con.prepareStatement("insert into emp values(?,?,?)");
				Scanner sc = new Scanner(System.in);) {

			con.setAutoCommit(false);
			try {
				for (int i = 1; i <= 3; i++) {
					System.out.println("Enter emp number"); // 109-113
					int a = sc.nextInt();

					System.out.println("Enter emp name");
					String b = sc.next();

					System.out.println("Enter emp salary");
					double c = sc.nextDouble();

					ps.setInt(1, a);
					ps.setString(2, b);
					ps.setDouble(3, c);
					ps.addBatch();
				}

				int rows[] = ps.executeBatch();
				con.commit();

				System.out.println(rows.length + " Records Inserted");
			} catch (SQLException ex1) {
				con.rollback();
				System.out.println("Log :" +ex1.getMessage());
				throw new MyException("Transaction rolled back!");
			}
		} 		
	}
}
