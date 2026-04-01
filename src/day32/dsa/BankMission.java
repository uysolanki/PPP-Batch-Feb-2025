package day32.dsa;

public class BankMission {

	public static void main(String[] args) {
		int shiftTimings[] = { 0, 3, 5, 6, 8, 11 };
		//int shiftTimings[] = { 0, 3, 3, 6, 7, 12 };
		int bankClosingHours = 12;
		int robbingTime = 3;
		int numberOfGaurds = shiftTimings.length / 2;
		boolean result=mission(shiftTimings,bankClosingHours,robbingTime);
		System.out.println(result);
	}

	
	private static boolean mission(int[] shiftTimings, int bankClosingHours, int robbingTime) {
		boolean bankMonitoredStatus[]=new boolean[bankClosingHours+1];
		int i;
		for(i=0;i<shiftTimings.length;i=i+2)
		{
			for(int j=shiftTimings[i]; j<=shiftTimings[i+1];j++)
				bankMonitoredStatus[j]=true;
		}
		
		if(shiftTimings[i-1]<bankClosingHours)
		{
			for(int k=shiftTimings[i-1]; k<=bankClosingHours;k++)
				bankMonitoredStatus[k]=false;
		}
		
		int z=0;
		for(i=0;i<bankClosingHours;i++)
		{
			if(bankMonitoredStatus[i]==false)
			z++;	
		}
		
		if(z>=robbingTime)
			return true;
		else
			return false;
	}


	

}
