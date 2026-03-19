package day25;

import java.util.HashMap;
import java.util.Map;

public class CountOccuranceOfWordsInASentance {

	public static void main(String[] args) {
		String sentance="one two three one two two three four five five five two six";
		
		String arr[]=sentance.split(" "); //["one", "two", "three", "one", "two", "two", three four five five five two six]

		Map<String,Integer> hashmap=new HashMap();
		
		for( String word: arr)		//word="one"
			hashmap.put(word,hashmap.getOrDefault(word, 0)+1);
		
		
		System.out.println(hashmap);
}}
//hashmap
//{
//}