package day24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapDemo1 {

	public static void main(String[] args) {
		Map<String,List<String>> foods=new HashMap();
		
		foods.put("fruits",new ArrayList<String>(Arrays.asList("Apple","Mango","Banana")));
		foods.put("vegetables",new ArrayList<String>(Arrays.asList("Onion","Potato","Brinjal")));
		foods.put("dry fruits",new ArrayList<String>(Arrays.asList("Almond","Cashew","Pista")));
		System.out.println(foods);
	}

}
