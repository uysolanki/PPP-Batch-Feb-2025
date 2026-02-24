package day12;

public class LPA27 {

	public static void main(String[] args) {

		int ans=divide(10,0);
		System.out.println(ans);
	}

	private static int divide(int n, int d) {

		try
		{
		double result=n/d;
		return 1;
		}
		catch(ArithmeticException e1)
		{
			return 2;
		}
		finally
		{
			return 3;
		}
		
	}

}
