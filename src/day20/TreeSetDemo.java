package day20;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
	Set<String> setA=new TreeSet();
	setA.add("Alice");
	setA.add("Elcid");
	setA.add("Ben");
	setA.add("David");
	setA.add("Chris");
	setA.add("David");
	System.out.println(setA);
	//System.out.println(setA);
	
	}
}


//cheat code
//hash order is not maintained
//linked order is maintained
//tree by default homogenous