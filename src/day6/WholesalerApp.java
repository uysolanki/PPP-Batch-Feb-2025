package day6;

import java.util.Scanner;

public class WholesalerApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);				
		
		System.out.println("Enter Quantity");	
		int qty=sc.nextInt();
		
		try
		{
		if(qty>=500)
			System.out.println("Order Accepted");
		else
		throw new LowQuantityException("Please enter qty > 500");
		}
		catch(LowQuantityException e1)
		{
			System.out.println(e1.getMessage());
		}
		

	}

}
