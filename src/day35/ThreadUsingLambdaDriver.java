package day35;

public class ThreadUsingLambdaDriver {

	public static void main(String[] args) {
		
		Runnable thread1=()->{
			for(int i=1;i<=100;i++)
				System.out.println("Thread1 "+i);
		};
		
		Thread tx=new Thread(thread1);
		tx.start();
		
		Runnable thread2=()->{
			for(int i=2;i<=200;i++)
				System.out.println("\tThread2 "+i);
		};
		
		Thread tx1=new Thread(thread2);
		tx1.start();

	}

}
