package day6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NestedTryDemo {

	public static void main(String[] args) {				//	0		1
		Scanner sc=new Scanner(System.in);					//	10		0
		int arr[]=new int[2];
		try
		{
		System.out.println("Enter valur for 0 index");	//10 
		arr[0]=sc.nextInt();
		
		System.out.println("Enter valur for 1 index");	//5
		arr[1]=sc.nextInt();
					try
					{
					System.out.println("Pls choose the index of Numerator");	//0
					int nIndex=sc.nextInt();									//nIndex=0
					int numerator=arr[nIndex];									//numerator =10
					
					System.out.println("Pls choose the index of Denominator");	//1
					int dIndex=sc.nextInt();									//dIndex=1
					int denominator=arr[dIndex];								//denominator=0;
					
					double result=numerator/denominator;
					System.out.println("Result is "+result);
					}
					catch(ArrayIndexOutOfBoundsException e2)
					{
						System.out.println("Please enter 1 or 0 only");
					}
					catch(ArithmeticException e3)
					{
						System.out.println("Denominator cannot be zero");
					}
		}
		catch(InputMismatchException e1)
		{
			System.out.println("Please enter integer values only");
		}
		
		

	}

}
