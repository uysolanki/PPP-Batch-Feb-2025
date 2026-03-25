package day28;

public class Alpha implements Runnable
{
	
@Override
public void run() {
	System.out.println(Thread.currentThread().getName());
	for(int i=1;i<=1000;i++)
		System.out.println(i);
}
}
