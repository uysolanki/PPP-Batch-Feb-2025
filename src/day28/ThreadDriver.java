package day28;

public class ThreadDriver {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		Alpha thread1 = new Alpha();
		Numeric thread2 = new Numeric("Thread-Vedant");

		Thread tx=new Thread(thread1,"Thread-Nitin");
		tx.start();
		thread2.start();

		System.out.println("Thread Priority of Thread-Nitin " + tx.getPriority());
		System.out.println("Thread Priority of Vedant-Nitin " + thread2.getPriority());
		
		tx.setPriority(10);
		thread2.setPriority(10);
		
		System.out.println("Thread Priority of Thread-Nitin " + tx.getPriority());
		System.out.println("Thread Priority of Vedant-Nitin " + thread2.getPriority());
	}

}
