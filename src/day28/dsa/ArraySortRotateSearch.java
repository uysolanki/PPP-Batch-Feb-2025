package day28.dsa;

import java.util.Arrays;

public class ArraySortRotateSearch {
public static void main(String[] args) {
	
	int arr[]= {8,2,3,7,6,9,5};
	System.out.println("Array Before Sorting" + Arrays.toString(arr));
	bubbleSort(arr);
	System.out.println("Array After Sorting" + Arrays.toString(arr));
	
	int mid=(int)Math.round((double)arr.length/2);
	System.out.println(mid);
	arrayLeftRotate(arr,mid);
	System.out.println("Array After Left Rotate on Mid" + Arrays.toString(arr));
	
	int search=7;
	int index=arraySearch(arr,search,mid);
	System.out.println(index==-1?"NOT FOUND ": "FOUND AT INDEX "+index+", ["+arr[index]+"]");
}



private static int arraySearch(int[] arr, int search,int mid) {
	
	
	if(search<arr[0])
	{
		return binarySearch(arr,mid,arr.length-1,search);
	}
	else
	{
		return binarySearch(arr,0,mid-1,search);
	}
}



private static int binarySearch(int[] arr, int first, int last, int search) {
//	int first=0;
//	int last= arr.length-1;
	
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



private static void arrayLeftRotate(int[] arr, int mid) {
	for(int i=1;i<=mid;i++)
	{
		int temp=arr[0];
		int j;
		for(j=1;j<arr.length;j++)
		{
			arr[j-1]=arr[j];
		}
		arr[j-1]=temp;
	}
	
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
}
