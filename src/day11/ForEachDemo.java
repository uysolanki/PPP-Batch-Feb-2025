package day11;

public class ForEachDemo {

	public static void main(String[] args) {
		//			0	1 2  3  4
		int arr[]= {10,20,30,40,50};
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Element at index "+ i + " is " + arr[i]);
		}
		
		int sum=0;
		for(int n:arr)						//n			sum
		{									//			0
			sum+=n;							//10		10
		}									//20		30
											//30		60
		System.out.println(sum);			//40		100
											//50		150
	}

}
