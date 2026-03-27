package day30.threadpooling;

public class Four implements Runnable
{	
@Override
public void run() 
{
	System.out.println(Thread.currentThread().getName());
	for(int i=301;i<=400;i++)
	{
		System.out.println("\t\t\t\t"+i);
	}
}
}
