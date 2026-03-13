package day21;

public class RecursionDemo {

	public static void main(String[] args) {
		int n=1;
		int ans=factorial1(n);
		System.out.println("Factorial of " + n + " is " + ans);

	}

	private static int factorial(int n) {
		int fact=1;							//dry run
		for(int i=1;i<=n;i++)				//i		fact		n
			fact=fact*i;					//1		1			5     is 1<=5 true
											//2		1				  is 2<=5 true	  
		return fact;						//3		2				  is 3<=5 true	
	}										//4		6				  is 4<=5 true	
											//5     24				  is 5<=5 true
											//6		120				  is 6<=5 false  loop terminate

	private static int factorial1(int n)
	{
		if(n==1)
			return 1;
		else
			return n*factorial1(n-1);
	}
}											


//5!  =  5 x 4 x 3 x 2 x 1
//4!  =	     4 x 3 x 2 x 1

//n!  =  n x (n-1)! 