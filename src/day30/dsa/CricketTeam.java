package day30.dsa;

public class CricketTeam {

	public static void main(String[] args) {
		int players[]= {100,80,60,40};
		int teamSize=3;
		int max=maximumTeams(players,teamSize);
		System.out.println("Maximum teams that can be formed: "+max);
	}

	private static int maximumTeams(int[] players, int teamSize) {
		int iterations=0;
		for(int possibleNumberOfTeams=1;possibleNumberOfTeams<=300;possibleNumberOfTeams++)
		{
				int totalPlayersNeeeded=possibleNumberOfTeams*teamSize; //30
				
				int avlPlayers=0;
				for(int i=0;i<players.length;i++)
				{
					avlPlayers+=Math.min(players[i], possibleNumberOfTeams);  //28
				}
				
				if(avlPlayers<totalPlayersNeeeded)
				{
					return possibleNumberOfTeams-1;
				}
		}
		return 0;
	}

}
