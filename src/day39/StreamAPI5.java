package day39;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamAPI5 {

	public static void main(String[] args) {
		
		List<String> words=new ArrayList(Arrays.asList("one","two","three","four","five","six","seven","eight","nine","ten"));
		
		//group by length
		
		Map<Integer,List<String>> groupbyLength=new HashMap();
		
		for(String word:words)
		{
			int key=word.length();
			groupbyLength.putIfAbsent(key, new ArrayList());
			
			groupbyLength.get(key).add(word);
		}
		
		System.out.println(groupbyLength);
		
		
		List<String> newWords=words.stream().map(word->word.toUpperCase()).collect(Collectors.toList());
		System.out.println(newWords);
		
		//group by length
		Map<Integer,List<String>> groupbyLength1= words.stream().collect(Collectors.groupingBy(word->word.length()));
		System.out.println(groupbyLength1);
		
		
		List<String> words1=new ArrayList(Arrays.asList("one","two","three","four","five","six","seven","eight","nine","ten"));
		
		Map<Boolean,List<String>> partitionByLenGtThan3=words1.stream().collect(Collectors.partitioningBy(str->str.length()>3));
		System.out.println(partitionByLenGtThan3);
	
	}
	
	
}

/*
 	{3: [one,two]
 	5 : [three }
 */
