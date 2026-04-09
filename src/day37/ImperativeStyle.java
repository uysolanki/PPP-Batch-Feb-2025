/*
    input : [1,2,3,4,5]
	output : [1,4,9,16,25]
 */
package day37;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ImperativeStyle {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList(Arrays.asList(1,2,3,4,5));
		
		List<Integer> squareNumbers=new ArrayList();		//step 1
		
		for(int n:numbers)									//step 2
		{
			int sqr=n*n;									//step 3
			squareNumbers.add(sqr);							//step 4
		}
		
		System.out.println(squareNumbers);					//step 5
		
		for(int n:squareNumbers)							
		{
			System.out.println(n);
		}
		
	}

}


//[1,4]