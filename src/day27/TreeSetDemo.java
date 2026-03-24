package day27;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		Set<String> treeset=new TreeSet();
		treeset.add("Ben");
		treeset.add("Alice");
		treeset.add("David");
		treeset.add("Chris");
		
		System.out.println(treeset);
		
		Student s1=new Student(18,"Virat",98.5);
		Student s2=new Student(45,"Rohit",88.5);
		Student s3=new Student(33,"Hardik",68.5);
		
		Set<Student> attendance=new TreeSet(new RnoComparator());		//Asc order of rno
		attendance.add(s1);
		attendance.add(s2);
		attendance.add(s3);
		
		System.out.println(attendance);
		
		
		Set<Student> examResultPublish=new TreeSet(new PerComparator());  //Desc order of per
		examResultPublish.add(s1);
		examResultPublish.add(s2);
		examResultPublish.add(s3);
		
		System.out.println(examResultPublish);
		
		
		Set<Student> examSeating=new TreeSet(new NameComparator());		//Asc order of name
		examSeating.add(s1);
		examSeating.add(s2);
		examSeating.add(s3);
		
		System.out.println(examSeating);
	}

}
