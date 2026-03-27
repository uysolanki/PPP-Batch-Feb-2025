package day30.threadpooling;

public class Six extends Thread
{
	
@Override
public void run() 
{
	System.out.println(Thread.currentThread().getName());
	for(int i=501;i<=600;i++)
	{
		System.out.println("\t\t\t\t\t\t"+i);
	}
}
}
