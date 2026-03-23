package day26;

public class CloneDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		Student s1=new Student(18,"Virat",78.5);
//		Student s2=s1;   //shallow
//		
//		System.out.println(s1.getRno());  //18
//		s2.setRno(45);
//		System.out.println(s1.getRno());  //45
		
		Student s2=s1.clone();
		
		System.out.println(s1.getRno());  //18
		s2.setRno(45);
		System.out.println(s1.getRno());  //18
	}

}
