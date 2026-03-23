package day26;

public class LinearSearchDemo {

	public static void main(String[] args) {
				//  i
		int arr[]= {8,2,9,3,5};
		
		int search=18;
		int flag=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==search)
			{
				System.out.println("FOUND");
				flag=1;
				break;
			}
		}
		
		if(flag==0)
			System.out.println("NOT FOUND");

	}

}
