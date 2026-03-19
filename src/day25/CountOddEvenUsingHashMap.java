package day25;

import java.util.HashMap;
import java.util.Map;

public class CountOddEvenUsingHashMap {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};  //odd=3, even=2
		Map<String,Integer> hashmap=new HashMap<String,Integer>();
		
		hashmap.put("oddcount",  0);    //1
		hashmap.put("evencount", 0);    //0
		
		for(int n:arr)
		{
			if(n%2==0)		//n=3  false
			{
				int oldcount=hashmap.get("evencount");  //oldcount=0
				int newCount=oldcount+1;				//newcount=1
				hashmap.put("evencount", newCount);
			}
			else
			{
				int oldcount=hashmap.get("oddcount");	//oldcount=1
				int newCount=oldcount+1;				//newcount=2
				hashmap.put("oddcount", newCount);
			}
				
		}
		
		System.out.println(hashmap);
	}

}
