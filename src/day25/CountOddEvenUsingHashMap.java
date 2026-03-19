package day25;

import java.util.HashMap;
import java.util.Map;

public class CountOddEvenUsingHashMap {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};  //odd=3, even=2
		Map<String,Integer> hashmap=new HashMap<String,Integer>();
		
		hashmap.put("oddcount", 0);		//1
		hashmap.put("evencount", 0);    //0
		
		for(int n:arr)
		{
			if(n%2==0)
			{
				int oldcount=hashmap.get("evencount");
				int newCount=oldcount+1;
				hashmap.put("evencount", newCount);
			}
			else
			{
				int oldcount=hashmap.get("oddcount");
				int newCount=oldcount+1;
				hashmap.put("oddcount", newCount);
			}
				
		}
		
		System.out.println(hashmap);
	}

}
