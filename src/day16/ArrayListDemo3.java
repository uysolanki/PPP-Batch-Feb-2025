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
		
		for(int i=0;i<a1.size();i++)				//maxAge		eldestEmp		i
		{											//0				p1				0
			if(a1.get(i).getAge() > maxAge)			//23							1
			{										//24			p3				2
				maxAge=a1.get(i).getAge();			//								3							
				eldestPerson=a1.get(i);				//								4
			}
		}
		
		System.out.println("Eldest Employee name is "+eldestPerson.getName());
	}
}

/*

[
  {
    "id": 6,
    "name": "June",
    "age": 43,
    "gender": "male",
    "department": "IT",
    "yearOfJoining": 2016,
    "salary": 900.0,
  },
  {
    "id": 5,
    "name": "May",
    "age": 43,
    "gender": "female",
    "department": "Sales",
    "yearOfJoining": 2015,
    "salary": 1000.0,
  },
  {
    "id": 11,
    "name": "November",
    "age": 43,
    "gender": "male",
    "department": "IT",
    "yearOfJoining": 2012,
    "salary": 1300.0,
  }
]
 
*/
