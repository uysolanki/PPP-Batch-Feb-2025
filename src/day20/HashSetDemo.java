package day20;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
	Set<Integer> setA=new HashSet();
	setA.add(1);
	setA.add(2);
	setA.add(3);
	setA.add(4);
	setA.add(5);
	System.out.println("A = " + setA);
	Set<Integer> setB=new HashSet();
	setB.add(4);
	setB.add(5);
	setB.add(6);
	setB.add(7);
	setB.add(8);
	System.out.println("B = " + setB);
//	setA.addAll(setB);
//	System.out.println("AUB = " + setA);
	
	setA.retainAll(setB);
	System.out.println("AnB = " + setA);
	}

}
