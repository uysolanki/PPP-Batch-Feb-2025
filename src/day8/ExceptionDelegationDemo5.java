package day8;

import java.io.IOException;
import java.util.Scanner;

public class ExceptionDelegationDemo5 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter Numerator");
		int num=sc.nextInt();
		System.out.println("Enter Denominator");
		int den=sc.nextInt();	
		try
		{
		double ans=divide(num,den);
		System.out.println("Result is "+ans);
		}
		catch(IOException e1)
		{}
		
	}

	private static double divide(int num,int den)  throws IOException
	{							
		return num/den;								
	}

}
