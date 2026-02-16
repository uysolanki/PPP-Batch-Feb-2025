package day6;

import java.io.IOException;
import java.util.Scanner;

public class UncheckedExceptionDemo {

	public static void main(String[] args) {
		int num=10;
		int den=2;
		
		double result=num/den;
		
		System.out.println("Result is "+result);
		
		String name=null;
		System.out.println(name.length());
		
	}

}
