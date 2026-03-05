package day17;
import java.util.ArrayList;
import java.util.List;

import day16.Person;

public class ArrayListDemo2 {

	public static void main(String[] args) {
	List<String> mh=new ArrayList();		//upcasting
	mh.add("Mumbai");
	mh.add("Pune");
	mh.add("Nagpur");
	System.out.println(mh.size());	//3
	List<String> rj=new ArrayList();		//upcasting
	rj.add("Jaipur");
	rj.add("Bikaner");
	rj.add("Jodhpur");
	System.out.println(rj.size());	//3
	
	
	List<List<String>> India=new ArrayList();
	India.add(mh);
	India.add(rj);
	System.out.println(mh.size());	//6
	
	System.out.println(mh);
	System.out.println(rj);
	System.out.println(India);
	
	System.out.println(India.get(0).get(2));


	}

}
//			0						1
//[[Mumbai, Pune, Nagpur], [Jaipur, Bikaner, Jodhpur]]
