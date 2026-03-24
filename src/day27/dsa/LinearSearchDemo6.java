package day27.dsa;

public class LinearSearchDemo6 {

	public static void main(String[] args) {
				
		String arr[]= {"Tom","Jerry","Alice","Ben","Harry"};
		int ans=linearSearch(arr);
		System.out.println(ans==-1?"NOT FOUND ": "FOUND AT INDEX "+ans);
	}

	private static int linearSearch(String[] arr) {
		//String search="Ben";
		String search="Ten";
		for(int i=0;i<arr.length;i++)					
			if(arr[i].equals(search)) return i;
			
		return -1;
	}

}
