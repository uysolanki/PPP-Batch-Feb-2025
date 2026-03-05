package day17;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<String> hashset=new HashSet();
		hashset.add("Alice");
		hashset.add("Ben");
		hashset.add("Chris");
		hashset.add("David");
		hashset.add("Chris");
		hashset.add(null);
		hashset.add(null);
		
		System.out.println(hashset);
		
		HashSet<Integer> setA=new HashSet();
		setA.add(1);
		setA.add(2);
		setA.add(3);
		
		System.out.println("A" +setA);
		HashSet<Integer> setB=new HashSet();
		setB.add(3);
		setB.add(4);
		setB.add(5);
		System.out.println("B" +setB);
					//AnB
		
//		setA.retainAll(setB);
//		System.out.println("AnB" +setA);
		
		setA.addAll(setB);
		System.out.println("AuB" +setA);
	}

}
