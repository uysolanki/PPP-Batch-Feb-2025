package day33.dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals2 {

	public static void main(String[] args) {
		//                                                 i
		int intervals[][] = {{1,3},{2,6},{8,10},{15,18}};
		//int intervals[][] = {{1,4},{4,5}};
		//int intervals[][] = {{4,7},{1,4}};
		
		Arrays.sort(intervals, (a, b) -> a[0] - b[0]);  //positive means swap
		
		System.out.println(Arrays.deepToString(intervals));
		List<List<Integer>> finalResult=new ArrayList();
		int start = intervals[0][0];  //15
        int end =   intervals[0][1];  //18
        
		for(int i=1;i<intervals.length;i++)//i=3
		{
			if(intervals[i][0]<=end)
			{
				end=intervals[i][1];
			}
			else
			{
				List<Integer> range=new ArrayList();   //[[1,6] [8,10],[15,18]]
				range.add(start);
				range.add(end);
				start = intervals[i][0];
		        end = intervals[i][1];
				finalResult.add(range);
			}
		}
		List<Integer> range=new ArrayList(); //[15,18]
		range.add(start);
		range.add(end);
		finalResult.add(range);
		System.out.println(finalResult);
	}

}
