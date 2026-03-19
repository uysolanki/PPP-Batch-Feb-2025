package day25;

import java.util.HashMap;
import java.util.Map;

public class FirstRepeatedChar {

	public static void main(String[] args) {
		//String sentance="viratkohli";
		//String sentance="mahendrasinghdhoni";
		String sentance="abc";
		
		char ch=getFirstRepeatedChar(sentance);
		System.out.println(ch);
		
}
		public static char getFirstRepeatedChar(String sentance)
		{
			Map<Character,Integer> hashmap=new HashMap();
			
			char arr[]=sentance.toCharArray();
			
			for(char ch:arr)
			{
				hashmap.put(ch, hashmap.getOrDefault(ch, 0)+1);
			}
			
			for(char ch:arr)
			{
				if(hashmap.get(ch)>1)
					return ch;
			}
			return '0';
			
		}

}
//hashmap
//{
//}