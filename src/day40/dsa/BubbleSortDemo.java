package day40.dsa;

import java.util.Arrays;

public class BubbleSortDemo {

	public static void main(String[] args) {
		int arr[]= {8,2,3,9,6};
		System.out.println("Before Sorting "+ Arrays.toString(arr));
		bubbleSort(arr);

		System.out.println("After Sorting "+ Arrays.toString(arr));

	}

	private static void bubbleSort(int arr[]) {
		for(int i=1;i<=arr.length;i++)
		{
		 for(int j=0;j<arr.length-i;j++)
		  {
		       if(arr[j] > arr[j+1])
		        {
		          int temp = arr[j];
		          arr[j]=arr[j+1];
		          arr[j+1]= temp;
		        }
		    }
		}
	}

}
