package day23;

import java.util.Scanner;

public class StackDemo {

	static int stack[]=new int[5];
	static int top=-1;
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		
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
			case 1 : push();break;
			case 2 : pop();break;
			case 3 : display();break;
			case 0 : System.exit(0);
			}
		}while(choice!=0);

	}

	private static void display() {
		if(top==-1)
			System.out.println("Stack is Empty, Nothing to Display");
		else
		{
			for(int i=top;i>=0;i--)
				System.out.println(stack[i]);
		}
		
	}

	private static void pop() {
		if(top==-1)
			System.out.println("Stack is Empty");
		else
		{
			int data=stack[top];
			System.out.println(data + " is Poped");
			top--;
		}
		
	}

	private static void push() {
		if(top==stack.length-1)
			System.out.println("Stack is full");
		else
		{
			top++;
			System.out.println("Enter data to Push");
			int data=sc.nextInt();
			stack[top]=data;
		}
		
	}
	
	

}
