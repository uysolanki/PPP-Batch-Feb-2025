package day8;

import java.util.Scanner;

public class ExceptionDelegationDemo {

	public static void main(String[] args) {
		divide();

	}

	private static void divide() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Numerator");
		int num=sc.nextInt();
		System.out.println("Enter Denominator");
		int den=sc.nextInt();								//accept
		
		try
		{
		double result=num/den;								//formula
		
		System.out.println("Result is "+result);			//divide
		}
		
		catch(ArithmeticException e1)						//exception handling
		{
			System.out.println(e1.getMessage());
		}
		
	}

}
