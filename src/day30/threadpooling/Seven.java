package day30.threadpooling;

public class Seven extends Thread
{
	
@Override
public void run() 
{
	System.out.println(Thread.currentThread().getName());
	for(int i=601;i<=700;i++)
	{
		System.out.println("\t\t\t\t\t\t\t"+i);
	}
}
}
