package day15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class UnSerializeDemo {

	public static void main(String[] args) {
		Student s1=null;
		String fileName="myfolder/file5.txt";
		
		try(FileInputStream fis = new FileInputStream(fileName);
			ObjectInputStream ois=new ObjectInputStream(fis))
		{
			s1=(Student)ois.readObject();
			System.out.println(s1);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
