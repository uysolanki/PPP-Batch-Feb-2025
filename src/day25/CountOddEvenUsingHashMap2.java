package day25;

import java.util.HashMap;
import java.util.Map;

public class CountOddEvenUsingHashMap2 {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};  //odd=3, even=2
		Map<String,Integer> hashmap=new HashMap<String,Integer>();
		
		hashmap.put("oddcount", 0);		//1
		hashmap.put("evencount", 0);    //0
		int oddCount=0,evenCount=0;
		for(int n:arr)
		{
			if(n%2==0)
				evenCount++;
			else
				oddCount++;
		}
		
		hashmap.put("oddcount", oddCount);		//1
		hashmap.put("evencount", evenCount);
		System.out.println(hashmap);
	}

}
