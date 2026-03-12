package day20;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo2 {

	public static void main(String[] args) {
	Set<String> setA=new HashSet();
	setA.add("Alice");
	setA.add("Ben");
	setA.add("Chris");
	setA.add("David");
	setA.add("Elcid");
	System.out.println(setA);
	
	System.out.println("Hashcode of Alice is " +"Alice".hashCode());
	System.out.println("Hashcode of Ben is " +"Ben".hashCode());
	System.out.println("Hashcode of Chris is " +"Chris".hashCode());
	System.out.println("Hashcode of David is " +"David".hashCode());
	System.out.println("Hashcode of Elcid is " +"Elcid".hashCode());
	
	
	System.out.println("Hashcode of Integer 1 is " +new Integer(1).hashCode());
	System.out.println("Hashcode of Integer 2 is " +new Integer(2).hashCode());
	System.out.println("Hashcode of Integer 3 is " +new Integer(3).hashCode());
	}
}


//cheat code
//hash order is not maintained
//linked order is maintained