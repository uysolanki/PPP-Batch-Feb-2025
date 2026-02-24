package day11;

public class CountIntegersInAString {
public static void main(String[] args) {
	
	String sentance="my name is Alice I am 8 years old i have 2 brothers and 1 sister";
	
	String words[]=sentance.split(" ");
	int counter=0;//1,2,3
	
	for(String word:words)						//word
	{											//"8"
			try
			{
			Integer.parseInt(word);
			counter++;
			}
			catch(NumberFormatException e1)
			{
				
			}
	}
	
	System.out.println("Number of Integers are "+counter);
	
}
}
