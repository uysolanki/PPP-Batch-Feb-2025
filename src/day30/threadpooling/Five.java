package day30.threadpooling;

public class Five extends Thread
{
	
@Override
public void run() 
{
	System.out.println(Thread.currentThread().getName());
	for(int i=401;i<=500;i++)
	{
		System.out.println("\t\t\t\t\t"+i);
	}
}
}
