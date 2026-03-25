package day28;

public class Alpha extends Thread
{
	
	public Alpha(String threadName)
	{
		super(threadName);
	}
@Override
public void run() {
	System.out.println(Thread.currentThread().getName());
	for(int i=1;i<=1000;i++)
		System.out.println(i);
}
}
