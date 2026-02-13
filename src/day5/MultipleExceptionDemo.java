package day5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleExceptionDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try
		{
		String name="Alice";
		name=null;
		
		System.out.println("Length of String is " +name.length());
		
		
		int ar[]=new int[5];	//index 0,1,2,3,4    
		
		ar[5]=100;				//throw new ArrayIndexOutOfBoundsException
		
		
		System.out.println("Enter Numerator");
		int num=sc.nextInt();
		System.out.println("Enter Denominator");
		int den=sc.nextInt();
		
		double result=num/den;
		
		System.out.println("Result is "+result);
		}
		catch(InputMismatchException e1)
		{
			//e1.printStackTrace();   //logging
			System.out.println("Please enter integer values only");
		}
		
		catch (ArithmeticException e2)
		{
			System.out.println(e2.getMessage());
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
