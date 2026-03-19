package day25;

import java.util.HashMap;
import java.util.Map;

public class CountOddEvenUsingHashMap3 {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};  //odd=3, even=2
		Map<String,Integer> hashmap=new HashMap<String,Integer>();
		
		for(int n:arr)		//n=3
		{
			if(n%2==0)		//false
				hashmap.put("evencount", hashmap.getOrDefault("evencount",0)+1);
			else
				hashmap.put("oddcount", hashmap.getOrDefault("oddcount",0)+1);  //after this line executes		
		}
		System.out.println(hashmap);
}}
//{
//"oddcount" :  2  
//"evencount" : 1
//}