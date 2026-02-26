package day14;

public class FindWordInAFile {

	public static void main(String[] args) {
		String str="full stack is a stack of technology this tech good";
		String search="is";
		
		int ans=searchWord(str,search);
		System.out.println(search + " appears " +ans+ " times");
	}
	
	
	public static int searchWord(String str,String search)
	{
		int counter=0;
		int startIndex=0;
		int index;
		
		do
		{
		index=str.indexOf(search,startIndex);
		
			if(index!=-1)
			{
			counter++;
			startIndex=index+search.length();
			}
		
		}while(index!=-1);
		
		return counter;
	}

}
