package day14;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadMultipleLines {
public static void main(String[] args) {
	String fileName="myfolder/file1.txt";
	
	try (BufferedReader br=new BufferedReader(new FileReader(fileName)))
	{
		String line;
		while((line=br.readLine())!=null)
		System.out.println(line);
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
