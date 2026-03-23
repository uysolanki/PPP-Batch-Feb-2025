package day26;

public class LinearSearchDemo4 {

	public static void main(String[] args) {
				//            i           i
		int arr[]= {8,2,9,3,5};
		
		linearSearch(arr);
	}

	private static void linearSearch(int[] arr) {
		int search=5;
		for(int i=0;i<arr.length;i++)						//i						arr[i]					search flag 
		{													//0		is 0<5 True		8		is 8==2 false	2      0
			if(arr[i]==search)								//1     is 1<5 True	 	2       is 2==2 true           1
			{
				System.out.println("FOUND");															//is 1==0 false
				return;
			}
		}
			
		System.out.println("NOT FOUND");
	}

}
