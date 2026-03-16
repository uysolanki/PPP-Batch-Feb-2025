package day23;

import java.util.Scanner;

public class MyQueueDriver {

	
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		MyQueue queue=new MyQueue();
		int choice=0;
		do
		{
			System.out.println("***** Queue Menu ******");
			System.out.println("1. INSERT");
			System.out.println("2. REMOVE");
			System.out.println("3. DISPLAY");
			System.out.println("0. EXIT");
			
			System.out.println("Enter choice");
			choice=sc.nextInt();
			
			switch(choice)
			{
			case 1 :
				System.out.println("Enter data to Insert");
				int data=sc.nextInt();
				queue.insert(data);
				break;
			case 2 : queue.remove();break;
			case 3 : queue.display();break;
			case 0 : System.exit(0);
			}
		}while(choice!=0);

	}
}
