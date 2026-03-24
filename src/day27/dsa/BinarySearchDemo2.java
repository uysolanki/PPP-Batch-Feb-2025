package day27.dsa;

public class BinarySearchDemo2 {

	public static void main(String[] args) {
		int arr[]= {2,3,4,6,8};
		int search=3;
		int index=binarySearch(arr,search);
		System.out.println(index==-1?"NOT FOUND ": "FOUND AT INDEX "+index+", ["+arr[index]+"]");
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
