package day16;

import java.util.ArrayList;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		ArrayList<String> a1 = new ArrayList<String>(); // collection class when used in homogenous mode
														// is called as GENERICS

		a1.add("Tom"); // 0
		a1.add("Alice"); // 1
		a1.add("Ben"); // 2
		a1.add("Chris"); // 3

		String name = a1.get(0);
		System.out.println("My name is " + name);

		ArrayList<Integer> a2 = new ArrayList<Integer>(); 
														
		a2.add(10); // 0
		a2.add(20); // 1
		a2.add(30); // 2
		a2.add(40); // 3

		Integer num1 = a2.get(0);
		System.out.println("My name is " + name);

	}

}
