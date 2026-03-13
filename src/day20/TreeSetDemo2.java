package day20;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo2 {

	public static void main(String[] args) {
	Person p1=new Person("Elcid", 28, 5.85, true);
	
	Person p2=new Person("Alice", 21, 5.65, true);
	
	Person p3=new Person("David", 23, 6.10, false);
	
	Person p5=new Person("Chris", 29, 6.10, false);
	
	Person p4=new Person("Ben", 32, 6.30, true);
	
	Set<Person> set=new TreeSet();
	set.add(p1);
	set.add(p2);
	set.add(p3);
	set.add(p4);
	set.add(p5);
	
	for(Person person:set)
	System.out.println(person);
	
	}
}


//cheat code
//hash order is not maintained
//linked order is maintained
//tree by default homogenous