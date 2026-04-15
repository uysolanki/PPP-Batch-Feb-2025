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
		
		Map<Boolean,Long> partitionByLenGtThan3count=words1.stream().collect(Collectors.partitioningBy(str->str.length()>3,Collectors.counting()));
		System.out.println(partitionByLenGtThan3count);
		
		
		//group by length show values in upper case list
		Map<Integer,List<String>> groupbyLengthUCase= words.stream().collect(Collectors.groupingBy(word->word.length(),Collectors.mapping(s->s.toUpperCase(), Collectors.toList())));
		System.out.println(groupbyLengthUCase);
		
		//group by length show count of each length
		Map<Integer,Long> groupbyLengthCount= words.stream().collect(Collectors.groupingBy(s->s.length(),Collectors.counting()));
		System.out.println(groupbyLengthCount);
		
		
		//List<String> words2=new ArrayList(Arrays.asList("one","two","two","three","three","three","four"));
		List<String> words2=new ArrayList(Arrays.asList("one","two","two","two","three","three","three","four","two"));
		
		Map<String,Long> wordCount=words2.stream().collect(Collectors.groupingBy(s->s,Collectors.counting()));
		System.out.println(wordCount);
		
		
		//find max occuring String
		String maxOccuranceString=wordCount.entrySet().stream()
		.max(Map.Entry.comparingByValue())
		.map(Map.Entry::getKey)
		.orElse(null);
		
		System.out.println(maxOccuranceString);
	}
	
	
}

/*
 	{3: [one,two]
 	5 : [three }
 */
