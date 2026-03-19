package day25;

import java.util.HashMap;
import java.util.Map;

public class CountOddEvenUsingHashMap4 {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};  //odd=3, even=2
		Map<String,Integer> hashmap=new HashMap<String,Integer>();
		
		hashmap.put("oddcount",  0);    //2
		hashmap.put("evencount", 0);    //1
		
		for(int n:arr)
		{
			if(n%2==0)		//n=3  false
			{
				hashmap.put("evencount",hashmap.get("evencount")+1);
			}
			else
			{
				hashmap.put("oddcount", hashmap.get("oddcount")+1);
			}		
		}
		
		System.out.println(hashmap);
	}

}
