package day9;

public class DriverApp2 {
public static void main(String[] args) {
	
	try
	{
		Student s1=new Student(18,"Alice");
		System.out.println(s1.getName().length());
	}
	catch(NullPointerException e1)
	{
		System.out.println("Please enter valid name");
	}
	
	
}
}
