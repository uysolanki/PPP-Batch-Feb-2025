package day27;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupWordsByLength {

	public static void main(String[] args) {
		String sentance="one two three four five six seven eight nine ten";
		Map<Integer,List<String>> hashmap=new HashMap<Integer,List<String>>();
		
		String words[]=sentance.split(" ");
		System.out.println(Arrays.toString(words));
		for(String word:words)
		{
			int key=word.length();
			hashmap.putIfAbsent(key, new ArrayList<String>());
			hashmap.get(key).add(word);
		}
		
		
	}

}

/*		//word="three"		key=5
{
3 : [one,two]
5 : [three]							
}									
*/




/*
3 [one,two,six,ten]
4 [four,five,nine]
5 [three,seven,eight]
*/