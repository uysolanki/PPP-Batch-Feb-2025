package day34;

public class DriverApp {

	public static void main(String[] args) {
//		Sample s1=new Test();
//		s1.greet();

		Sample s1 = () -> {
			System.out.println("Welcome to RCB Virat");
		};
		
		Sample s2 = () -> {
			System.out.println("Welcome to MI Rohit");
		};
		
		Sample s3 = () -> {
			System.out.println("Welcome to RR Sanju");
		};
		
		s1.greet();
		s2.greet();
		s3.greet();
		
		
		
		Sample1 s4 = (teamName) -> {
			System.out.println(String.format("Welcome to %s Dhoni", teamName));
		};
		
		Sample1 s5 = teamName -> {
			System.out.println(String.format("Welcome to %s Axar", teamName));
		};
		
		Sample1 s6 = teamName -> System.out.println(String.format("Welcome to %s Suryakumar", teamName));
		
		s4.greet("CSK");
		s5.greet("DC");
		s6.greet("SRH");
	}

}
