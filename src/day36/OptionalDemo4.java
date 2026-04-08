package day36;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo4 {

	public static void main(String[] args) {
//		Optional<Student> student=getName(18);
//		Optional<String> str=student.map((stud)->stud.getName().toLowerCase());
//		System.out.println(str.get());
		
		
		Optional<List<Student>> students=getStudents(1);
		Optional<List<String>> name = students.map((stud)->stud.stream().map(stud1->stud1.getName()).toList());
		System.out.println(name.get());
		
	}
	
	
	public static Optional<Student> getName(int empId)
	{
			if(empId==18)
			return Optional.of(new Student(18,"Virat",78.5));
			else
			return Optional.empty();
	}
	
	
	public static Optional<List<Student>> getStudents(int deptId)
	{
			List<Student> students =new ArrayList(Arrays.asList(new Student(45,"Rohit",88.5),new Student(63,"Surya",98.5),new Student(18,"Virat",78.5)));
			if(deptId==1)
			return Optional.of(students);
			else
			return Optional.empty();
		
	}


}
