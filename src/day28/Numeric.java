package day28;

public class Numeric extends Thread
{
	public Numeric(String threadName)
	{
		super(threadName);
	}
@Override
public void run() {
	System.out.println(Thread.currentThread().getName());
	for(int i=2000;i<=3000;i++)
		System.out.println("\t"+i);
}
}
