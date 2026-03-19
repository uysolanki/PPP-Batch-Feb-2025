package day25;

public class CountOddEven {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};  //odd=3, even=2
		int oddCount=0,evenCount=0;
		for(int n:arr)
		{
			if(n%2==0)
				evenCount++;
			else
				oddCount++;
		}
		
		System.out.println("Odd Count "+oddCount);
		System.out.println("Even Count "+evenCount);
	}

}
