package day16;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
			ArrayList a1=new ArrayList();  //heterogenous mode by default
			
			a1.add(10);			//0
			a1.add("Alice");	//1
			a1.add(10.5);		//2	
			a1.add(true);		//3
			a1.add(null);		//2	
			a1.add(null);
			a1.add("Alice");
			a1.add("Alice");
			
			
			System.out.println(a1);
			
			Integer a=(Integer)a1.get(0); //as ArrayList is in heterogenous mode, extra overhead of typecasting
			//int b=(int)a1.get(0);
			
			System.out.println(a);
			//System.out.println(b);
			
			String name=(String)a1.get(1);
			System.out.println("My name is "+name);
		
	}

}
