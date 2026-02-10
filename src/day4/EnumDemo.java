package day4;

import java.util.Scanner;

public class EnumDemo {

	public static void main(String[] args) {
//		Weekday today=Weekday.TUESDAY;
//		
//		System.out.println("Today is "+ today);
//		
//		Planet planet=Planet.JUPITER;
//		
//		System.out.println("We are living on "+planet);
//		System.out.println("Gravity "+planet.calculateGravity());
		
		
		Errors error;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Username");
		String username=sc.next();
		
		if(username.length()<3)
		{
			error=Errors.ERR1;
			System.out.println(error.getError_message());
			return;
		}
		
		System.out.println("Enter Password");
		String password=sc.next();
		
		if(password.length()<8)
		{
			error=Errors.ERR2;
			System.out.println(error.getError_message());
		}
		
		
	}

}
