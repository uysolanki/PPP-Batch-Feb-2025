package day26;

public class LinearSearchDemo6 {

	public static void main(String[] args) {
				
		int arr[]= {8,2,9,3,5};
		int ans=linearSearch(arr);
		System.out.println(ans==-1?"NOT FOUND ": "FOUND AT INDEX "+ans);
	}

	private static int linearSearch(int[] arr) {
		int search=5;
		for(int i=0;i<arr.length;i++)					
			if(arr[i]==search) return i;
			
		return -1;
	}

}
