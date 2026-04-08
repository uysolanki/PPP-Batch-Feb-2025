package day36;

import java.util.Optional;
import java.util.function.Supplier;

public class OptionalDemo5 {

	public static void main(String[] args) {
		
		Optional<Student> student=getName(19);
		//student.ifPresent((stud)->System.out.println(stud.getName().length()));

		System.out.println(student.orElseGet(()->test()));
	}
	

	
	public static Optional<Student> getName(int empId)
	{
			if(empId==18)
			return Optional.of(new Student(18,"Virat",78.5));
			else
			return Optional.empty();
	}
	
	public static Student test()
	{
		Student backUpStudent=new Student(1,"Alice",50.0);
		return backUpStudent;
	}
	
//	public static String test1()
//	{
//		
//		return "Vedant";
//	}


}
