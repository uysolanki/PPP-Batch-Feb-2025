/*
    input : [1,2,3,4,5]
	output : [1,4,9,16,25]
 */
package day37;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
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
		
		//print the count of odd elements in the array
		long counter=numbers.stream().filter( (num) -> num%2==1   ).count();
		System.out.println(counter);
		
		
		List<Integer> numbers1 = new ArrayList(Arrays.asList(1,2,2,3,4,4,5,5));
		List<Integer> uniqueNumbers=numbers1.stream().distinct().toList();
		
		System.out.println(uniqueNumbers);
		
		
		List<Integer> top3Numbers=numbers1.stream().limit(3).toList();
		System.out.println(top3Numbers);
		
		List<Integer> uniqueNumbersAfter3=numbers1.stream().skip(3).distinct().toList();
		System.out.println(uniqueNumbersAfter3);
		
		int sum=numbers1.stream().mapToInt(n->n).sum();
		System.out.println(sum);
		
		List<String> numbers2 = new ArrayList(Arrays.asList("one","two","three"));
		OptionalDouble avg=numbers2.stream().mapToInt(n->n.length()).average();
		System.out.println(avg.orElse(0.0));
		
//		List<Integer> numbers3 = new ArrayList(Arrays.asList());
//		double avg1=numbers3.stream().mapToInt(n->n).average().orElse(99.0);
//		System.out.println(avg1);
		
		
		List<Integer> numbers3 = new ArrayList(Arrays.asList());
		OptionalDouble avg1=numbers3.stream().mapToInt(n->n).average();
		
		try
		{
		System.out.println(avg1.orElseThrow(()-> new RuntimeException("No Data Found")));
		}
		catch (Exception e) {
		System.out.println(e.getMessage());
		}
		
		
		
		List<Integer> numbers4 = new ArrayList(Arrays.asList(10,12,3,14,5));
		
		OptionalInt minimum=numbers4.stream().mapToInt(n->n).min();
		System.out.println(minimum.orElse(0));
		
		int minimum1=numbers4.stream().mapToInt(n->n).max().orElse(0);
		System.out.println(minimum1);
		
		
		List<Integer> ascsortedList= numbers4.stream().sorted( (n1,n2)->n1-n2).toList();
		System.out.println(ascsortedList);
		
		List<Integer> descsortedList= numbers4.stream().sorted( (n1,n2)->n2-n1).toList();
		System.out.println(descsortedList);
		
		
		List<Integer> numbers5 = new ArrayList(Arrays.asList(9,12,15,6,2));		//false
		boolean status=numbers5.stream().allMatch(n->n%3==0);
		System.out.println(status);
		
		
		List<Integer> numbers6 = new ArrayList(Arrays.asList(19,12,2,16,2));		//true
		boolean status1=numbers6.stream().anyMatch(n->n%3==0);
		System.out.println(status1);
		
		List<Integer> numbers7 = new ArrayList(Arrays.asList(19,11,2,16,2));		//true
		boolean status2=numbers7.stream().noneMatch(n->n%3==0);
		System.out.println(status2);
		
		List<Integer> numbers8 = new ArrayList(Arrays.asList(19,11,12,16,2));		//true
		Optional<Integer> n=numbers8.stream().findFirst();
		System.out.println(n.get());
		
		List<Integer> numbers9 = new ArrayList(Arrays.asList(19,11,12,16,2));		//true
		Optional<Integer> n5=numbers9.stream().filter(n1->n1%3==0).findFirst();
		System.out.println(n5.get());
	}

}


//[1,4]