package day17;
import java.util.ArrayList;
import java.util.List;

import day16.Person;

public class ArrayListDemo {

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
	
	
	List<String> India=new ArrayList();
	India.addAll(mh);
	India.addAll(rj);
	System.out.println(mh.size());	//6
	
	System.out.println(mh);
	System.out.println(rj);
	System.out.println(India);


	}

}

