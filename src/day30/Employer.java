package day30;

public class Employer extends Thread
{
	private ICICIBank bank;
	public Employer(ICICIBank bank)
	{
		this.bank=bank;
	}
@Override
public void run() {
	
	try 
	{
		Thread.sleep(10000);
	} catch (InterruptedException e) 
	{
	
	}
	bank.deposit(40000.0);
}
}
