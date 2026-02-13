package day5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleExceptionInSingleCatch {

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
		catch(InputMismatchException | ArithmeticException e2)
		{
			//System.out.println("Please enter non zero integer values only");
			e2.printStackTrace();
		}
	
		
		catch (ArrayIndexOutOfBoundsException e3)
		{
			System.out.println(e3.getMessage());
		}
		
		catch (Exception e4)		//default EH
		{
			System.out.println("Ref is not pointing to any object");
		}

		System.out.println("Hi");
	}

}
