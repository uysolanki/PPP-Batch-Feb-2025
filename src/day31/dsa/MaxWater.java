package day31.dsa;

public class MaxWater {

	public static void main(String[] args) {
		int wallHeights[] = { 1, 8, 9, 2, 5, 8 };
		int maxWater = calculateMaxWater(wallHeights);
		System.out.println(maxWater);
	}

	private static int calculateMaxWater(int[] arr) {
		int first = 0;
		int last = arr.length - 1;
		int maxArea = 0;

		while (first <= last) {
			int height = Math.min(arr[first], arr[last]); // 1
			int width = last - first; // 8

			int area = height * width; // 8

			if (area > maxArea)
				maxArea = area;

			if (arr[first] < arr[last])
				first++;
			else
				last--;
		}
		return maxArea;
	}

}
