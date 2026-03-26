package day29;

public class Father extends Thread
{
	private HDFCBAnk bank;
	public Father(HDFCBAnk bank)
	{
		this.bank=bank;
	}
@Override
public void run() {
	
	try 
	{
		Thread.sleep(15000);
	} catch (InterruptedException e) 
	{
	
	}
	bank.deposit(15000.0);
}
}
