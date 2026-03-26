package day29;

public class HDFCBAnk {
private double balance;

public HDFCBAnk(double balance)
{
	this.balance=balance;
	
	
}

public synchronized void deposit(double depositAmount)
{
	this.balance+=depositAmount;
	notify();
}

public synchronized void withdraw(double withdrawAmount)
{
	if(withdrawAmount>this.balance)
	{
		System.out.println("Tyring to Withdraw " + withdrawAmount);
		System.out.println("Insufficient Funds "+this.balance);
		System.out.println("Waiting for Father to deposit money");
		try {
			wait();
			
		} catch (InterruptedException e) 
		{
			
		}	
	}
	this.balance-=withdrawAmount;
	System.out.println("Withdraw Successful of Rs" + withdrawAmount);
	System.out.println("Balance is "+this.balance);
}
}
