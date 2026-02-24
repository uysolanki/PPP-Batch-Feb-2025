package day10;

import java.util.Scanner;

public class ExceptionChainingDemo {

	public static void main(String[] args) {
		
		try
		{
		double cost=calculateTotalTilingCost();
		System.out.println("Total Cost of Tiling is "+cost);
		}
		catch(Exception e1)
		{
			System.out.println("Message to Customer : "+e1.getMessage());
		}
	}

	private static double calculateTotalTilingCost() throws Exception
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter per square feet tile cost");
		double price=sc.nextDouble();
		System.out.println("Enter Length of room");
		int length=sc.nextInt();
		System.out.println("Enter Width of room");
		int width=sc.nextInt();
		Rectangle room=new Rectangle(length,width);
		//double area=getAreaOfRoom(room);
		try
		{
		double area=getAreaOfRoom(null);
		return area*price;
		}
		catch(NullPointerException e1)
		{
			System.out.println("Message to Programmer : There is a Null Object, Pls troubleshoot");
			//e1.printStackTrace();
			throw new Exception("Network Down, Please try After some time");
		}
		
	}

	private static double getAreaOfRoom(Rectangle room) throws NullPointerException
	{
		return room.getLenght()*room.getWidth();
	}

	

}
