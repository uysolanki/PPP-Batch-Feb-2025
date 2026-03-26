package day29;

public class Numeric extends Thread
{
	public Numeric() {}
	public Numeric(String threadName)
	{
		super(threadName);
	}
@Override
public void run() 
{
	System.out.println(Thread.currentThread().getName());
	for(int i=1;i<=10;i++)
	{
		System.out.println(i);
		try
		{
			Thread.sleep(1000);
		} catch (InterruptedException e) 
		{
			System.out.println(e.getMessage());
		}
	}
}
}
