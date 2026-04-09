/*
    input : [1,2,3,4,5]
	output : [1,4,9,16,25]
 */
package day37;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionStyle {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList(Arrays.asList(1,2,3,4,5));
		//store the squares of each number in a seperate list
		List<Integer> sqrNumbers =numbers.stream().map((num)-> num*num  ).toList();  //jdk 16 onwards
		System.out.println(sqrNumbers);
		List<Integer> sqrNumbers1 =numbers.stream().map((num)-> num*num  ).collect(Collectors.toList()); //1.8
		System.out.println(sqrNumbers1);
		
		//store the squares of only odd number in a seperate list
		List<Integer> sqrOddNumbers= numbers.stream().filter( (num) -> num%2==1   ).map( (num)->num*num   ).toList();
		System.out.println(sqrOddNumbers);
		
		//print the squares of only odd number
		numbers.stream().filter( (num) -> num%2==1   ).map( (num)->num*num   ).forEach( (num)->System.out.println(num));
	}

}


//[1,4]