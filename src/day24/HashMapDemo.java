package day24;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<String,Integer> emps=new HashMap();
		emps.put("Alice", 800);
		emps.put("Ben", 900);
		emps.put("Chris", 1000);
		emps.put("David", 1100);
		
		System.out.println(emps);
		
		
		Map<String,Integer> emps1=new LinkedHashMap();
		emps1.put("Alice", 800);
		emps1.put("Tom", 900);
		emps1.put("Frank", 1000);
		emps1.put("David", 1100);
		
		System.out.println(emps1);
		
		
		Map<String,Integer> emps2=new TreeMap();
		emps2.put("Alice", 800);
		emps2.put("Tom", 900);
		emps2.put("Frank", 1000);
		emps2.put("David", 1100);
		
		System.out.println(emps2);
		
		Set<String> keys=emps.keySet();
		System.out.println(keys);
		System.out.println(emps.values());
		
		
		for(Entry<String,Integer> singleEmployee : emps.entrySet())
		{
			System.out.println(singleEmployee.getKey() + " " + singleEmployee.getValue());
		}
		
		
		//display total salary
		double totalSalary=0.0;
		for(Entry<String,Integer> singleEmployee : emps.entrySet())
		{
			totalSalary+=singleEmployee.getValue();
		}
		
		System.out.println(totalSalary);
	}

}
