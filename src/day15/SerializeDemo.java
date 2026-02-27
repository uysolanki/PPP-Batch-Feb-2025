package day15;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeDemo {

	public static void main(String[] args) {
		Student s1=new Student(18,"Virat");
		String fileName="myfolder/file5.txt";
		
		try(FileOutputStream fos = new FileOutputStream(fileName);
			ObjectOutputStream oos=new ObjectOutputStream(fos))
		{
			oos.writeObject(s1);
			System.out.println("Object written to file");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
