package day19;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		Vector<String> v1 = new Vector(); // No Args constructor
											// default capacity 10
											// default increment x2 size>capacity

//		System.out.println("CAPACITY "+ v1.capacity()); //10
//		System.out.println("SIZE "+ v1.size());			//0		
//		
//		v1.add("Apple");
//		System.out.println("CAPACITY "+ v1.capacity());	//10
//		System.out.println("SIZE "+ v1.size());			//1
//		
//		for(int i=22;i<=30;i++)  //loop will run 9 times
//			v1.add("Apple");
//		
//		System.out.println("CAPACITY "+ v1.capacity());	//10 correct
//		System.out.println("SIZE "+ v1.size());			//10
//		
//		v1.add("Apple");
//		
//		System.out.println("CAPACITY "+ v1.capacity());	//20 correct
//		System.out.println("SIZE "+ v1.size());			//11

//		Vector<String> v2=new Vector(6);	//Para constructor
//											//user def capacity 6
//											//default increment x2
//		
//		for(int i=1;i<=6;i++) 
//			v2.add("Apple");  //Capa 6
//												  //Size 6
//		
//		System.out.println("CAPACITY "+ v2.capacity());	//Capa 6
//		System.out.println("SIZE "+ v2.size());			//Size 6
//		
//		v2.add("Apple");
//		
//		System.out.println("CAPACITY "+ v2.capacity());	//Capa 12
//		System.out.println("SIZE "+ v2.size());			//Size 7

		Vector<String> v2 = new Vector(6,3); // Para constructor
											 // user def capacity 6
											 // user def increment 3

		for (int i = 1; i <= 6; i++)
			v2.add("Apple"); 			//	Capa 6
										// Size 6

		System.out.println("CAPACITY " + v2.capacity()); // Capa 6
		System.out.println("SIZE " + v2.size()); // Size 6

		v2.add("Apple");

		System.out.println("CAPACITY " + v2.capacity()); // Capa 9
		System.out.println("SIZE " + v2.size()); 		// Size 7
		
		
		Vector<String> v3 = new Vector(); 
		v3.addElement("Alice");

	}

}
