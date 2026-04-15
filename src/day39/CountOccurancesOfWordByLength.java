package day39;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class CountOccurancesOfWordByLength {

	public static void main(String[] args) {
		List<String> words=new ArrayList(Arrays.asList("one","two","two","two","three","three","three","four","two"));
		
		Map<Integer,List<String>> hashmap=new HashMap();
		
		for(String word:words)
		{
			int key=word.length();
			hashmap.putIfAbsent(key, new ArrayList());

			hashmap.get(key).add(word);
		}
		
		System.out.println(hashmap);
		
		Map<Integer,Integer> groupbyLengthCount=new HashMap();
		for(Entry<Integer,List<String>> entry:hashmap.entrySet())
		{
			groupbyLengthCount.put(entry.getKey(), entry.getValue().size());
		}
		
		System.out.println(groupbyLengthCount);
		
		Map<Integer,Long> groupbyLengthCount1= words.stream().collect(Collectors.groupingBy(s->s.length(),Collectors.counting()));
		System.out.println(groupbyLengthCount1);
		
		//["three","three","three","four"]
		long wordsGtThanLength3=words.stream().filter(str->str.length()>3).count();
		System.out.println(wordsGtThanLength3);
		
		
		Map<Boolean,Long> hashmap1=words.stream().collect(Collectors.partitioningBy(str->str.length()>3,Collectors.counting()));
		System.out.println(hashmap1.get(false));
	
		System.out.println(words.stream().count());
	}

}
