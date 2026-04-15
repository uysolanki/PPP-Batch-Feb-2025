package day27;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupByAnagrams {

	public static void main(String[] args) {
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
//Input  [listen, note, tone, abc, bac, silent, enot, cab, apple]
//Output [[listen,silent], [note, tone, enot], [abc, bac, cab]]


//einlst :[listen,silent]
//eont :  [note,enot,tone]
//abc :   [abc,cab,bca]
//
/*{
	eionst : [listen]
	eont : [tone]
}*/