package day36;

import java.util.Optional;
import java.util.function.Supplier;

public class OptionalDemo6 {

	public static void main(String[] args) {
		try
		{
		Optional<Student> student=getName(19);
		//student.ifPresent((stud)->System.out.println(stud.getName().length()));

		System.out.println(student.orElseThrow(()->new RuntimeException("Student Not Found")));
		}
		catch(RuntimeException ex1)
		{
			System.out.println(ex1.getMessage());
		}
	}
	

	
	public static Optional<Student> getName(int empId)
	{
			if(empId==18)
			return Optional.of(new Student(18,"Virat",78.5));
			else
			return Optional.empty();
	}

}
