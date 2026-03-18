package day24;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class HashMapDemo2 {

	public static void main(String[] args) {
		Map<String,Student> fyStudents=new HashMap();
		
		fyStudents.put("first", new Student(1,"Alice",88.5));
		fyStudents.put("second", new Student(2,"Ben",78.5));
		fyStudents.put("third", new Student(3,"Chris",68.5));
		
		//display name of student who has come first in FY
		System.out.println(fyStudents.get("first").getName());
		
		Map<String,Student> syStudents=new HashMap();
		
		syStudents.put("first", new Student(23,"Raj",98.5));
		syStudents.put("second", new Student(41,"Bunty",88.5));
		syStudents.put("third", new Student(28,"Ravi",78.5));
		
		//display percentage of student who has come third in SY
		System.out.println(syStudents.get("third").getPer());
		
		List<Map<String,Student>>   college = new ArrayList();
		college.add(fyStudents);
		college.add(syStudents);
		
		//display name of student who has come first in SY in the college  //output raj
		System.out.println(college.get(1).get("first").getName());
		
		
		List<Map<String,Student>>   college1 = new ArrayList();
		college1.add(fyStudents);
		college1.add(syStudents);
		
		//display name of student who has come first in SY in the college  //output raj
		System.out.println(college.get(1).get("first").getName());
		
		//display name of all toppers in college
		
		System.out.println(fyStudents.containsKey("first"));
		
		System.out.println("Toppers of each class");
		for(Map<String,Student> year:college)
			System.out.println(year.get("first").getName());
	}

}
