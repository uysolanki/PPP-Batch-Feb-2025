package day30.dsa;

public class CricketTeamBinarySearch {

	public static void main(String[] args)
	{
		int players[]= {100,80,60,40};
		int teamSize=4;
		int max=maximumTeams(players,teamSize);
		System.out.println("Maximum teams that can be formed: "+max);
	}

	private static int maximumTeams(int[] players, int teamSize) {
		int low=1;
		int high=300;
		while(low<=high)
		{
			int mid=(low+high)/2;
			
			if(midTeamsPossible(players,mid,teamSize))
			{
				if(midTeamsPossible(players,mid+1,teamSize))
				{
					low=mid+1;
				}
				else
				{
					return mid;
				}
			}
			else
			{
				high=mid-1;
			}
		}
		return 0;
		}

	private static boolean midTeamsPossible(int[] players, int possibleNumberOfTeams, int teamSize) {
		int totalPlayers=possibleNumberOfTeams*teamSize;
		int avlPlayers=0;
		for(int i=0;i<players.length;i++)
		{
			avlPlayers+=Math.min(players[i], possibleNumberOfTeams);  //28
		}
		if(avlPlayers>=totalPlayers) 
			return true; 
		else 
			return false;
	}

}
