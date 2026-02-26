package day13;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TryWithResources {
public static void main(String[] args) {
	String fileName="myfolder/file98.txt";
	
	try (FileWriter fw=new FileWriter(fileName,true))
	{
		File file=new File(fileName);
		if(file.exists())
		{
		fw.append(" my friends");
		}
		else
		{
			System.out.println("File does not exists");
		}
	} 
	catch (IOException e) 
	{
		e.printStackTrace();
	}
	
	//System.out.println("Data written to file");
}
}
