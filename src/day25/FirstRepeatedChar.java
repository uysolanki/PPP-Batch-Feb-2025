package day25;

import java.util.HashMap;
import java.util.Map;

public class FirstRepeatedChar {

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
			int loopCounter=0;
			if(sentance==null || sentance.length()==0)
				return null;
			sentance=sentance.replace("\\s+", "").toLowerCase();	//space tabs
			Map<Character,Integer> hashmap=new HashMap();
			
			char arr[]=sentance.toCharArray();
			
			for(char ch:arr)
			{
				loopCounter++;
				if(Character.isDigit(ch))
					continue;
				
				hashmap.put(ch, hashmap.getOrDefault(ch, 0)+1);
			}
			
			for(char ch:arr)
			{
				loopCounter++;
				if(hashmap.get(ch)>1)
				{
					System.out.println("Iteration COunt" + loopCounter);
					return ch;
				}
					
			}
			
			return null;
			
		}

}
//hashmap
//{
//}