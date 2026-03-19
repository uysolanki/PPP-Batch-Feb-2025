package day25;

import java.util.HashMap;
import java.util.Map;

public class PutIfAbsentDemo {

	public static void main(String[] args) {
		Map<Integer,String> hashmap=new HashMap();
		
		hashmap.put(1, "Apple");
		hashmap.put(2, "Mango");
		hashmap.putIfAbsent(1, "Banana");
		System.out.println(hashmap);
	}

}
