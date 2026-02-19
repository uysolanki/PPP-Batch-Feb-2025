package day8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDelegationDemo3 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter Numerator");
		int num=sc.nextInt();
		System.out.println("Enter Denominator");
		int den=sc.nextInt();	
		
		double ans=divide(num,den);
		System.out.println("Result is "+ans);
	}

	private static double divide(int num,int den)  throws ArithmeticException
	{							
		return num/den;								
	}

}
