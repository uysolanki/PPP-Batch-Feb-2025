package day14;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadSingleLine2 {
public static void main(String[] args) {
	String fileName="myfolder/file11.txt";
	
	try (FileReader fr=new FileReader(fileName);
		BufferedReader br=new BufferedReader(fr))
	{
		String data=br.readLine();
		System.out.println(data);
	} 
	catch (FileNotFoundException e) 
	{
		System.out.println("File not Found");
	}
	catch (IOException e) 
	{
		e.printStackTrace();
	}

}
}
