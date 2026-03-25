package day28;

public class ThreadDriver {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		Alpha thread1 = new Alpha("Thread-Nitin");
		Numeric thread2 = new Numeric("Thread-Vedant");

		thread1.start();
		thread2.start();

		System.out.println("Thread Priority of Thread-Nitin " + thread1.getPriority());
		System.out.println("Thread Priority of Vedant-Nitin " + thread2.getPriority());
		
		thread1.setPriority(10);
		thread2.setPriority(10);
		
		System.out.println("Thread Priority of Thread-Nitin " + thread1.getPriority());
		System.out.println("Thread Priority of Vedant-Nitin " + thread2.getPriority());
	}

}
