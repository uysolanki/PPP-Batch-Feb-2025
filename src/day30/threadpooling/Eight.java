package day30.threadpooling;

public class Eight extends Thread
{
	
@Override
public void run() 
{
	System.out.println(Thread.currentThread().getName());
	for(int i=701;i<=800;i++)
	{
		System.out.println("\t\t\t\t\t\t\t\t"+i);
	}
}
}
