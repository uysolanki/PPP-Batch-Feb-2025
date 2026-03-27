package day29.dsa;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateFromArray {

	public static void main(String[] args) {
	int arr[]= {1,2,3,2,4,1,5};
	
	Set<Integer> duplicates=new HashSet();		//[1,2,3,4]
	
	for(int n:arr)					//n
	{								//2
		if(!duplicates.contains(n))
			duplicates.add(n);
	}
	System.out.println(duplicates);
	}

}
