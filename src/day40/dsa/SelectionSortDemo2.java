package day40.dsa;

import java.util.Arrays;

public class SelectionSortDemo2 {

	public static void main(String[] args) {
		int arr[]= {8,2,3,9,6};
		System.out.println("Before Sorting "+ Arrays.toString(arr));
		selectionSort(arr);

		System.out.println("After Sorting "+ Arrays.toString(arr));

	}

	private static void selectionSort(int arr[]) {
		for(int i=0;i<arr.length;i++)
		{
		 for(int j=i+1;j<arr.length;j++)
		  {
		       if(arr[i] > arr[j])
		        {
		          int temp = arr[i];
		          arr[i]=arr[j];
		          arr[j]= temp;
		        }
		    }
		}
	}

}
