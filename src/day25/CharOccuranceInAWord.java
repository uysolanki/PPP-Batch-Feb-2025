package day25;

import java.util.HashMap;
import java.util.Map;

public class CharOccuranceInAWord {

	public static void main(String[] args) {
		String sentance="viratkohli";
		Map<Character,Integer> hashmap=new HashMap();
		
		char arr[]=sentance.toCharArray();
		
		for(char ch:arr)
		{
			hashmap.put(ch, hashmap.getOrDefault(ch, 0)+1);
		}
		
		
		
		System.out.println(hashmap);
}}
//hashmap
//{
//}