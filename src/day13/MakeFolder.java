package day13;

import java.io.File;

public class MakeFolder {
public static void main(String[] args) {
	File file=new File("myfolder");
	if(!file.exists())
	{
		file.mkdir();
	}
	
	System.out.println("Folder created");
	
}
}
