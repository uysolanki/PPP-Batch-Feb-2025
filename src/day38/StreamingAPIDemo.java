package day38;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StreamingAPIDemo {

	public static void main(String[] args) {
		List<String> months=new ArrayList(Arrays.asList("January","February","March","April","May","June","July","August","September","October","November","December"));
		StreamingAPIDemo sd=new StreamingAPIDemo();
		//display the month names vertically
		
		//months.stream().forEach((month)->System.out.println(month));
		//months.stream().forEach(month->System.out.println(month));
		//months.stream().forEach(StreamingAPIDemo::display);
		months.stream().forEach(sd::display1);
		months.stream().map(month->month.toUpperCase()).forEach(month->System.out.println(month));
		months.stream().map(String::toUpperCase).forEach(month->System.out.println(month));
		months.stream().map(String::toUpperCase).forEach(System.out::println);
		
		months.stream().map(String::toUpperCase).forEach(month->System.out.println("I Like" +month));
		months.stream().map(String::toUpperCase).forEach(StreamingAPIDemo::display);
		
		//display month names whose length is > 5
		
		months.stream().filter(month->month.length()>5).forEach(System.out::print);
		System.out.println(Arrays.toString(months.stream().mapToInt(month->month.length()).toArray()));
		System.out.println(months.stream().map(month->month.length()).toList());
		
		//display month names starting with 'J'
		
		//months.stream().filter(month->month.startsWith("J")).forEach(System.out::println);
		months.stream().filter(StreamingAPIDemo::JMonths).forEach(System.out::println);
		
		
		Predicate<String> startsWithJ = month -> month.startsWith("J");
		
		months.stream().filter(startsWithJ).forEach(System.out::println);
		
		//count months ending with y
		long x=months.stream().filter(month->month.endsWith("y")).count();
		System.out.println(x);
		
	}
	
	public static boolean JMonths(String str)
	{
		if(str.startsWith("J"))
			return true;
		else
			return false;
	}
	
	public static void display(String str)
	{
		System.out.println("I Like the month " +str);
	}
	
	public void display1(String str)
	{
		System.out.println(str);
	}
}



//method referencing
//1. static
//2. non static
