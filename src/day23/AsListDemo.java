package day23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AsListDemo {

	public static void main(String[] args) {
	//1,2,3,1,2,4
		List<Integer> numbers=new ArrayList();
		
		//option 1
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(1);
		numbers.add(2);
		numbers.add(4);
		
		System.out.println(numbers);
		List<Integer> numbers2=new ArrayList(Arrays.asList(1, 2, 3, 1, 2, 4));
		System.out.println(numbers2);
		numbers2.add(2,99);
		System.out.println(numbers2);
		
		
		List<Integer> numbers3=Arrays.asList(1, 2, 3, 1, 2, 4);
		System.out.println(numbers3);
		numbers3.get(3);
		System.out.println(numbers3);
	}

}
