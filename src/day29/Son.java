package day29;

public class Son extends Thread
{
	private HDFCBAnk bank;
	public Son(HDFCBAnk bank)
	{
		this.bank=bank;
	}
@Override
public void run() {
	bank.withdraw(10000.0);
}
}
