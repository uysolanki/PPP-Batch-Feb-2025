package day3;

import java.util.Scanner;

public class DriverApp {
public static void main(String[] args) {
	
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter Name");
	String customerName=sc.next();
	
	System.out.println("Enter Date of Play");
	String dateOfPlay=sc.next();
	
	System.out.println("Enter Time of Play");
	String timeOfPlay=sc.next();
	
	
	System.out.println("**** Turf Options *****");
	System.out.println("1. Cricket");
	System.out.println("2. Football");
	System.out.println("3. Tennis");
	
	System.out.println("Choice :");
	int turfChoice=sc.nextInt();//turfChoice=2
	
	Turf turf=TurfMananger.getTurf(turfChoice);
	
	System.out.println(turf.getCompanyName());
	System.out.println("Customer Name "+customerName);
	System.out.println("Date Of Play "+dateOfPlay);
	System.out.println("Time Of Play "+timeOfPlay);
	System.out.println("Turf "+turf.getTurfName());
	System.out.println("Price "+turf.getTurfPrice());
	
}
}
