package day25;

import java.util.HashMap;
import java.util.Map;

public class CountOccuranceOfWordsInASentance {

	public static void main(String[] args) {
		String sentance="one two three one two two three four five five five two six";
		
		Map<String,Integer> hashmap=new HashMap<String,Integer>();
		
		for(int n:arr)		//n=4
		{
			if(n%2==0)		//true
				hashmap.put("evencount", hashmap.getOrDefault("evencount",0)+1);
			else
				hashmap.put("oddcount", hashmap.getOrDefault("oddcount",0)+1);  //after this line executes		
		}
		System.out.println(hashmap);
}}
//hashmap
//{
//"oddcount" : 2
//"evencount" :2
//}