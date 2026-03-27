package day30.threadpooling;

public class Three extends Thread
{
	
@Override
public void run() 
{
	System.out.println(Thread.currentThread().getName());
	for(int i=201;i<=300;i++)
	{
		System.out.println("\t\t\t"+i);
	}
}
}
