package day36;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		//String name="Anil";
		//String name=null;
		
		Optional<String> name=getName(0);
//		if(name.isPresent())
//			System.out.println(name.get());

		System.out.println(name.orElse("No Name Found"));
	}
	
	
//	public static String getName(int empId)
//	{
//			if(empId==1)
//			return "Anil";
//			else
//			return("No Name Found");
//	}
	
	
	public static Optional<String> getName(int empId)
	{
			if(empId==1)
			return Optional.of("Anil");
			else
			return Optional.empty();
	}


}
