package day30.threadpooling;

public class Two extends Thread
{
	
@Override
public void run() 
{
	System.out.println(Thread.currentThread().getName());
	for(int i=101;i<=200;i++)
	{
		System.out.println("\t\t"+i);
	}
}
}
