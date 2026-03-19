package day25;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatedChar {

	public static void main(String[] args) {
		//String sentance="viratkohli";
		//String sentance="mahendr sijgt xyopi";
		//String sentance="abc";
		//String sentance="virat kohli";
		//String sentance=null;
		//String sentance="";
		//String sentance="   ";		//edge cases handle
		String sentance="MahendrA Singh Dhoni";
		
		Character ch=getFirstRepeatedChar(sentance);
		if(ch==null)
			System.out.println("No Repeated Char Found");
		else
			System.out.println(ch);
		
}
		public static Character getFirstRepeatedChar(String sentance)
		{
			
			if(sentance==null || sentance.length()==0)
				return null;
			sentance=sentance.replace(" ", "").toLowerCase();
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
			return null;
			
		}

}
//hashmap
//{
//}