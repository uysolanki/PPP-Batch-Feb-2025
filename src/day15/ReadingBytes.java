package day15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadingBytes {

	public static void main(String[] args) {	
		String fileName="myfolder/file3.txt";
		
		try(FileInputStream fis=new FileInputStream(fileName))
		{
			int n;
			do
			{
				n=fis.read();
				if(n==-1)
					break;
				
				char ch=(char)n;
				if(Character.isUpperCase(ch))
						System.out.print(Character.toLowerCase(ch));
				else if(Character.isLowerCase(ch))
						System.out.print(Character.toUpperCase(ch));
				else if(Character.isSpace(ch))
						System.out.print("@");
				else if(Character.isDigit(ch))
					System.out.print("#");
					 	
				//System.out.println(n);    //65  112   112  108  101
			}while(n!=-1);
		} 
		catch (FileNotFoundException e)  
		{
			
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			
			e.printStackTrace();
		}

	}

}
