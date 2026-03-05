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
	List<String> gj=new ArrayList();		//upcasting
	gj.add("Surat");
	gj.add("Rajkot");
	gj.add("Ahmedabad");
	
	List<String> India=new ArrayList();
	India.addAll(mh);
	India.addAll(rj);
	India.addAll(gj);
	
	System.out.println(India.size());	//9
	
	System.out.println(mh);
	System.out.println(rj);
	System.out.println(India);
	
	System.out.println(India.get(2));

	
	India.retainAll(mh);
	System.out.println(India.size());	//3
	}

}

