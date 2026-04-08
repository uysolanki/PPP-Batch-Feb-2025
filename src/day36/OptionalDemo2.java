package day36;

import java.util.Optional;

public class OptionalDemo2 {

	public static void main(String[] args) {
		//String name="Anil";
		//String name=null;
		Student backUpStudent=new Student(1,"Alice",50.0);
		Optional<Student> student=getName(19);
//		if(name.isPresent())
//			System.out.println(name.get());

		Student x=student.orElse(backUpStudent);
		System.out.println(x);
	}
	
	
//	public static String getName(int empId)
//	{
//			if(empId==1)
//			return "Anil";
//			else
//			return("No Name Found");
//	}
	
	
	public static Optional<Student> getName(int empId)
	{
			if(empId==18)
			return Optional.of(new Student(18,"Virat",78.5));
			else
			return Optional.empty();
	}


}
