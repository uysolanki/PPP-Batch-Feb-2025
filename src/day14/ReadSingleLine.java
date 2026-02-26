package day14;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadSingleLine {
public static void main(String[] args) {
	String fileName="myfolder/file1.txt";
	
	try 
	{
//		FileReader fr=new FileReader(fileName);
//		BufferedReader br=new BufferedReader(fr);
//		
	
		BufferedReader br=new BufferedReader(new FileReader(fileName));
		String data=br.readLine();
		System.out.println(data);
//		fr.close();
		br.close();
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
