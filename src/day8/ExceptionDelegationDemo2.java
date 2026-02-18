package day8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDelegationDemo2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		try
		{
		System.out.println("Enter Numerator");
		int num=sc.nextInt();
		System.out.println("Enter Denominator");
		int den=sc.nextInt();	
		
		double ans=divide(num,den);
		System.out.println("Result is "+ans);
	    }
		catch(ArithmeticException e1)						//exception handling
		{
			System.out.println(e1.getMessage());
		}
		catch(InputMismatchException e2)						//exception handling
		{
			System.out.println(e2.getMessage());
		}
	}

	private static double divide(int num,int den)  throws ArithmeticException
	{							
		return num/den;								
	}

}
