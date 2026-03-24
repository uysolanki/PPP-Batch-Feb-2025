package day27.dsa;

import java.util.Arrays;

public class BinarySearchDemo3 {

	public static void main(String[] args) {
		int arr[]= {4,3,6,1,8};
		Arrays.sort(arr);
		//bubbleSort(arr);
		int search=8;
		int index=binarySearch(arr,search);
		System.out.println(index==-1?"NOT FOUND ": "FOUND AT INDEX "+index+", ["+arr[index]+"]");
	}

	private static void bubbleSort(int[] arr) {
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
	}

	private static int binarySearch(int[] arr,int search) {
		int first=0;
		int last= arr.length-1;
		
		while(first<=last)
		{
			int mid=(first+last)/2;			//mid=2
			if(arr[mid]==search)
				return mid;
			else if(arr[mid]<search)
				first=mid+1;
			else
				last=mid-1;
		}
	  	
		return -1;
	}

}
