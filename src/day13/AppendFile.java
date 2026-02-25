package day13;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class AppendFile {
public static void main(String[] args) {
	String fileName="myfolder/file1.txt";
	
	try 
	{
		File file=new File(fileName);
		if(file.exists())
		{
		FileWriter fw=new FileWriter(fileName,true);
		fw.append(" my friends");
		fw.close();
		}
		else
		{
			System.out.println("File does not exists");
		}
	} catch (IOException e) 
	{
		e.printStackTrace();
	}
	
	//System.out.println("Data written to file");
}
}
