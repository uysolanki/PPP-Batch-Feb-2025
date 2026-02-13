package day5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleExceptionDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try
		{
		System.out.println("Enter Numerator");
		int num=sc.nextInt();
		System.out.println("Enter Denominator");
		int den=sc.nextInt();
		
		double result=num/den;
		
		System.out.println("Result is "+result);
		}
		catch(InputMismatchException e1)
		{
			e1.printStackTrace();
		}
		
		catch (ArithmeticException e2)
		{
			System.out.println(e2.getMessage());
		}


		System.out.println("Hi");
	}

}
