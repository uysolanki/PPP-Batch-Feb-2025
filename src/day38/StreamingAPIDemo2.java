package day38;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamingAPIDemo2 {

	public static void main(String[] args) {
		//List<Integer> numbers=new ArrayList(Arrays.asList(1,2,3,4,5,6,7));
		List<Integer> numbers=new ArrayList(Arrays.asList());
//		List<Integer> facts=numbers.stream().map(n->{
//			int fact=1;
//			for(int i=1;i<=n;i++)
//				fact=fact*i;
//			
//			return fact;	
//		}).toList();
//		
//		System.out.println(facts);
		
		
		List<Integer> facts=numbers.stream().map(StreamingAPIDemo2::factorial).toList();
		
		System.out.println(facts);
		
		//display factorial of only 5 return asnswer in a list []
		List<Integer> facts5=numbers.stream().skip(4).limit(1).map(StreamingAPIDemo2::factorial).toList();
		System.out.println(facts5);//[120]
		
		//display factorial of only 5 return asnswer in a int                     [120]    120
		int facts5new=numbers.stream().skip(4).limit(1).map(StreamingAPIDemo2::factorial).findFirst().orElse(0);
		System.out.println(facts5new);//120
		
		
		//display factorial of only 5 return asnswer in a int                     [120]    120
		Optional<Integer> x=numbers.stream().skip(4).limit(1).map(StreamingAPIDemo2::factorial).findFirst();
		//System.out.println(x.get());//120
		System.out.println(x.orElse(0));//120
		System.out.println(x.orElseGet(()->test()));//120
		//System.out.println(x.orElseThrow(()->new RuntimeException()));//120
		x.ifPresent(n->System.out.println(n*n*n));
		System.out.println(x.isPresent()?"Value Found" : "Value Not Found");
	}
	
	public static int factorial(int n)
	{
		if(n==1)return 1;
		else return n* factorial(n-1);
	}
	
	public static int factorial1(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
			fact=fact*i;
		
		return fact;
	}
	
	public void display1(String str)
	{
		System.out.println(str);
	}
	
	public static int test()
	{
		return 999;
	}
}



//method referencing
//1. static
//2. non static
