package day32.dsa;

import java.util.Arrays;

public class BankMissionAtTime {

	public static void main(String[] args) {
		int shiftTimings[] = { 0, 3, 5, 6, 8, 11 };
		//int shiftTimings[] = { 0, 3, 3, 6, 7, 12 };
		int bankClosingHours = 12;
		int robbingTime = 3;
		int numberOfGaurds = shiftTimings.length / 2;
		int result=mission(shiftTimings,bankClosingHours,robbingTime);
		System.out.println(result==-1?"Mission Impossible":"Mission completed at " + result + "pm");
	}

	
	private static int mission(int[] shiftTimings, int bankClosingHours, int robbingTime) {
		
		boolean bankMonitoredStatus[]=new boolean[bankClosingHours];
		System.out.println(Arrays.toString(bankMonitoredStatus));
		int i;
		for(i=0;i<shiftTimings.length;i=i+2)
		{
			for(int j=shiftTimings[i]; j<shiftTimings[i+1] && j<bankClosingHours;j++)
				bankMonitoredStatus[j]=true;
		}
		
		System.out.println(Arrays.toString(bankMonitoredStatus));
//		if(shiftTimings[i-1]<bankClosingHours)
//		{
//			for(int k=shiftTimings[i-1]; k<=bankClosingHours-1;k++)
//				bankMonitoredStatus[k]=false;
//		}
		
		int z=0;
		for(i=0;i<bankClosingHours;i++)
		{
			if(bankMonitoredStatus[i]==false)
			z++;	
			if(z==robbingTime)
				return i+1;
		}
		
		return -1;
	}


	

}
