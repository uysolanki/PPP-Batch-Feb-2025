package day28;

public class Numeric extends Thread
{
@Override
public void run() {
	for(int i=2000;i<=3000;i++)
		System.out.println("\t"+i);
}
}
