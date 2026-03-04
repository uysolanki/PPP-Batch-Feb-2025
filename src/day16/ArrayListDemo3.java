package day16;

import java.util.ArrayList;

public class ArrayListDemo3 {

	public static void main(String[] args) {
		ArrayList<Person> a1 = new ArrayList<Person>(); // collection class when used in homogenous mode
														// is called as GENERICS

//		Person p1=new Person("Alice", 21, 5.10, true);
//		Person p2=new Person("Ben", 21, 5.10, true);
//		Person p3=new Person("Alice", 21, 5.10, true);
//		Person p4=new Person("Alice", 21, 5.10, true);
//		a1.add(p1); // 0
//		a1.add(p2); // 1
//		a1.add(p3); // 2
//		a1.add(p4); // 3
//
//		Person px = a1.get(0);
//		System.out.println("My name is " + px.getName());
	
		a1.add(new Person("Alice", 23, 5.10, true)); 	// 0
		a1.add(new Person("Ben", 21, 5.10, true)); 		// 1
		a1.add(new Person("Chris", 24, 5.10, true)); 	// 2
		a1.add(new Person("David", 19, 5.10, true)); 	// 3

		Person px = a1.get(0);
		System.out.println("My name is " + px.getName());
		
		
		int maxAge=0;
		Person eldestPerson=null;
		
		for(int i=0;i<a1.size();i++)
		{
			if(a1.get(i).getAge() > maxAge)
			{
				maxAge=a1.get(i).getAge();
				eldestPerson=a1.get(i);
			}
		}
		
		System.out.println("Eldest Employee name is "+eldestPerson.getName());
	}
}
