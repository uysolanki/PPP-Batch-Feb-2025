package day35;

public class ThreadUsingLambdaDriver1 {

	public static void main(String[] args) {
		Thread tx=null;
		Runnable thread1=()->{
			for(int i=1;i<=100;i++)
				System.out.println("Thread1 "+i);
		};
		
		tx=new Thread(thread1);
		tx.start();
		
		Runnable thread2=()->{
			for(int i=2;i<=200;i++)
				System.out.println("\tThread2 "+i);
		};
		
		tx=new Thread(thread2);
		tx.start();

	}

}
