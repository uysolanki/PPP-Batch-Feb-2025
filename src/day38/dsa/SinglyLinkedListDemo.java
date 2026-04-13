package day38.dsa;

import java.util.Scanner;

public class SinglyLinkedListDemo {

	public static void main(String[] args) {
		 Node start1=null;
		 Node start2=null;
		 start1=createList(start1);
		 display(start1);
		 sortList(start1);
		 display(start1);
		 start2=createList(start2);
		 display(start2);
		 sortList(start2);
		 display(start2);
		 
		 start1= mergeList(start1,start2);
		 sortList(start1);
		 display(start1);
	}

	private static Node mergeList(Node start1, Node start2) {
		Node temp=start1;
		while(temp.next!=null)
			temp=temp.next;
		temp.next=start2;
		return start1;
		
	}

	private static void sortList(Node start) {
		for(Node i=start; i!=null;i=i.next)
		{
			for(Node j=i.next; j!=null;j=j.next)
			{
				if(i.data>j.data)
				{
					int temp=i.data;
					i.data=j.data;
					j.data=temp;
				}
			}
		}
			
		
	}

	private static void display(Node start) {
		Node temp=start;
		while(temp!=null)
		{
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		System.out.println("NULL");
	}

	private static Node createList(Node start) {
		Scanner sc=new Scanner(System.in);
		System.err.println("Enter size of Linked List");
		int size=sc.nextInt();
		Node temp=null;
		for(int i=1;i<=size;i++)
		{
			System.err.println("Enter data for node "+ i + " :");
			int data=sc.nextInt();
			Node nn=new Node(data);
			
			if(start==null)
				temp=start=nn;
			else
			{
				temp.next=nn;
				temp=temp.next;
			}
		}
		return start;
	}

}


/*
Problem: Organizing Customer Orders by Price

A small online store records customer orders as they come in. 
Each order has a price, and orders are stored in the sequence they are received using a singly linked list.

However, at the end of the day, the store manager wants to analyze orders in ascending order of price to:

Identify cheapest orders
Offer discounts on low-value orders
Generate reports
*/