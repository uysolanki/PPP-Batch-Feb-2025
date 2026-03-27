package day30.threadpooling;

public class One extends Thread
{
	
@Override
public void run() 
{
	System.out.println(Thread.currentThread().getName());
	for(int i=1;i<=100;i++)
	{
		System.out.println(i);
	}
}
}
