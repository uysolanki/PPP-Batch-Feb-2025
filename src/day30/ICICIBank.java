package day30;

public class ICICIBank {
	private double balance;

	public ICICIBank(double balance)
	{
		this.balance=balance;
		
		
	}

	public synchronized void deposit(double depositAmount)
	{
		System.out.println("Owner Deposited Money with Bank" + depositAmount);
		this.balance+=depositAmount;
		notifyAll();
	}

	public synchronized void withdraw(String empName,double withdrawAmount)
	{
		if(withdrawAmount>this.balance)
		{
			System.out.println(empName +"Tyring to Withdraw Salary" + withdrawAmount);
			System.out.println("Insufficient Funds "+this.balance);
			System.out.println(empName + "Waiting for Company to deposit Salary");
			try {
				wait();
				
			} catch (InterruptedException e) 
			{
				
			}	
			
		}
		this.balance-=withdrawAmount;
		System.out.println(empName +"Withdraw Successful of Rs" + withdrawAmount);
		System.out.println("Balance is "+this.balance);
	}
}
