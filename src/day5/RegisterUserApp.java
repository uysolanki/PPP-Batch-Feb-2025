package day5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RegisterUserApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter name");
		String name=sc.next();
		
		System.out.println("Enter age");  //ten
		try
		{
		int age=sc.nextInt();
		}
		catch(InputMismatchException e1)
		{
			System.out.println("Please enter int value only");
		}
		
		System.out.println("Hi");
	}
}
