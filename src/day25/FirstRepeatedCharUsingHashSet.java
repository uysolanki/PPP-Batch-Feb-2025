package day25;

import java.util.HashSet;
import java.util.Set;

public class FirstRepeatedCharUsingHashSet {

	public static void main(String[] args) {
		String sentance="abba";
		//String sentance="mahendr sijgt xyopi";
		//String sentance="abc";
		//String sentance="virat kohli";
		//String sentance=null;
		//String sentance="";
		//String sentance=" ";		//edge cases handle space 
		//String sentance="   	";		//edge cases handle tab
		//String sentance="m111ahendr1 sijgt1 xyopi";
		//String sentance="MahendrA Singh Dhoni";
		
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
			sentance=sentance.replace("\\s+", "").toLowerCase();	//space tabs
			Set<Character> hashset=new HashSet();
			
			char arr[]=sentance.toCharArray();
			
			for(char ch:arr)			//abba   ch='b'
			{
				if(!hashset.add(ch))
					return ch;			//['a','b']
			}
			
			return null;	
		}
}
//hashmap
//{
//}