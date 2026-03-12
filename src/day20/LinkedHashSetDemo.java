package day20;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
	Set<String> setA=new LinkedHashSet();
	setA.add("Alice");
	setA.add("Elcid");
	setA.add("Ben");
	setA.add("David");
	setA.add("Chris");
	System.out.println(setA);
	//System.out.println(setA);
	
	}
}


//cheat code
//hash order is not maintained
//linked order is maintained