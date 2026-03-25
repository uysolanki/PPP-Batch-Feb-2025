package day28;

public class ThreadDriver {

	public static void main(String[] args) {
	Alpha thread1=new Alpha();
	Numeric thread2=new Numeric();
	
	thread1.start();
	thread2.start();

	}

}
