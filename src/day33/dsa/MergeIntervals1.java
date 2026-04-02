package day33.dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals1 {

	public static void main(String[] args) {
		                                      
		//int intervals[][] = {{1,3},{2,6},{8,10},{15,18}};
		int intervals[][] = {{1,4},{4,5}};
		System.out.println(Arrays.deepToString(intervals));
		List<List<Integer>> finalResult=new ArrayList();
		int i=0;
		for(i=0;i<intervals.length-1;)
		{
			int start=intervals[i][0];
			int end= intervals[i][1];
			List<Integer> range=new ArrayList();  //[8,10]
			range.add(start);
			if(intervals[i+1][0]<=end)
			{
				range.add(intervals[i+1][1]);
				i=i+2;
			}
			else
			{
				range.add(intervals[i][1]);
				i=i+1;
			}
			finalResult.add(range);
		}
		List<Integer> range1=new ArrayList();
		range1.add(intervals[i][0]);
		range1.add(intervals[i][1]);
		finalResult.add(range1);
		System.out.println(finalResult);
	}

}
