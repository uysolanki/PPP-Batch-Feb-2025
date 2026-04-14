package day38;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByAnagram {

	public static void main(String[] args) {
	//usingHashMap();	
	usingStream();	

	}

	private static void usingStream() {
		String sentance="listen note tone abc bac silent enot cab apple";
		String words[]=sentance.split(" ");
		List<String> wordsList = new ArrayList(Arrays.asList(words));
		System.out.println(wordsList);
		Map<String,List<String>> groupByAnagrams= wordsList
				.stream()
				.collect(Collectors.groupingBy(str->{
					char arr[]=str.toCharArray(); 
					Arrays.sort(arr);  			  
					String key=new String(arr);
					return key;
				}));
			
		System.out.println(groupByAnagrams.values());
	}

	private static void usingHashMap() {
		String sentance="listen note tone abc bac silent enot cab apple";
		String words[]=sentance.split(" ");
		
		Map<String,List<String>> hashmap=new HashMap();
		
		for(String word:words)		//word="tone"
		{
			char arr[]=word.toCharArray(); //['t' ,'o', 'n', 'e']
			Arrays.sort(arr);  			   //['e', 'o', 'n' , 't']
			String key=new String(arr);    //"eont"
			
			hashmap.putIfAbsent(key, new ArrayList<String>());
			hashmap.get(key).add(word);
			 
		}
		
			System.out.println(hashmap.values());


		
	}

}
