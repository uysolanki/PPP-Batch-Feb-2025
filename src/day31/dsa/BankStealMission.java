package day31.dsa;

public class BankStealMission {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

/*
A bank is guarded by multiple security guards working in different time shifts 
during the day. Each guard is active during a specific time interval.

You are given:

numOfGuards → number of guards
timeToSteal → minimum continuous hours required to successfully steal
totalBankHours → total number of hours the bank operates
ShiftTimings[] → an array representing guard shifts in pairs
(start₁, end₁), (start₂, end₂), …

Your task is to determine whether a robbery is possible based on unguarded hours.

👉 If total unguarded hours ≥ timeToSteal → return "Possible"
👉 Otherwise → return "Impossible"


12 close
{0,3,5,6,8,11}

t=8

mission completed at 7pm
mission impossible

*/