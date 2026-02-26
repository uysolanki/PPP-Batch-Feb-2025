package day13;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile2 {
public static void main(String[] args) {
	String fileName="myfolder/file98.txt";
	
	try 
	{
		FileWriter fw=new FileWriter(fileName);
		fw.write("Welcome");
//		fw.close();
	} catch (IOException e) 
	{
		e.printStackTrace();
	}
	
	System.out.println("Data written to file");
}
}
