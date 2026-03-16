package day23;

import java.util.Scanner;

public class MyStackDriver {

	
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		MyStack stack=new MyStack();
		int choice=0;
		do
		{
			System.out.println("***** Stack Menu ******");
			System.out.println("1. PUSH");
			System.out.println("2. POP");
			System.out.println("3. DISPLAY");
			System.out.println("0. EXIT");
			
			System.out.println("Enter choice");
			choice=sc.nextInt();
			
			switch(choice)
			{
			case 1 :
				if(!stack.isFull())
				{
					System.out.println("Enter data to push");
					int data=sc.nextInt();
					stack.push(data);
				}
				break;
			case 2 : stack.pop();break;
			case 3 : stack.display();break;
			case 0 : System.exit(0);
			}
		}while(choice!=0);

	}
}
