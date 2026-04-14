package day39;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamAPI3 {

	public static void main(String[] args) {
		List<Integer> numbers4 = new ArrayList(Arrays.asList(1,2,3,4,5));
		
		int result=numbers4.stream().reduce(100,(acc,num)->acc+num);
		System.out.println(result);
		
		List<Double> numbers5 = new ArrayList(Arrays.asList(1.1,2.1,3.1,4.1,5.1));
		
		double result1=numbers5.stream().reduce(100.0,(acc,num)->acc+num);
		System.out.println(result1);
	}

}
