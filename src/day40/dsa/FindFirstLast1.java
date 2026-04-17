package day40.dsa;

import java.util.Arrays;

public class FindFirstLast1 {
	public static void main(String[] args) {
		int arr[]= {1,2,2,2,3,3,3,4,5,5};
		int target=2;
		int brr[]=searchRange(arr,target);
		System.out.println(Arrays.toString(brr));
	}

    public static int[] searchRange(int[] nums, int target) {
    	
    	int a=findFirst(nums, target);
    	int b= findLast(nums, target);
    	
    	int ans[]= {a,b};
    	return ans;
    	
    }

    private static int findFirst(int[] nums, int target) {
        int left = 0,
        right = nums.length - 1;
        int ans=-1;
        while (left <= right) {
            int mid = (left + right) / 2;

            if (nums[mid] == target) 
            {
                ans= mid;
                right = mid - 1;
            }
            else if (nums[mid] >= target)
            {
                right = mid - 1;   
            } 
            else
            {
                left = mid + 1;
            }
        }

        return ans;
    }

    private static int findLast(int[] nums, int target) {
    			int left = 0,
    	        right = nums.length - 1;
    			int ans=-1;
    	        while (left <= right) {
    	            int mid = (left + right) / 2;

    	            if (nums[mid] == target) 
    	            {
    	               ans= mid;
    	               left = mid + 1;
    	            }
    	            else if (nums[mid] >= target)
    	            {
    	                right = mid - 1;   
    	            } 
    	            else
    	            {
    	                left = mid + 1;
    	            }
    	        }

    	        return ans;
    }
}
