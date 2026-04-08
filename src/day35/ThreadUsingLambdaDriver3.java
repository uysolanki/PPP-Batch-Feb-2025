package day35;

public class ThreadUsingLambdaDriver3 {

	public static void main(String[] args) {
		Thread tx=null;
		
		tx=new Thread(()->{
			for(int i=1;i<=100;i++)
				System.out.println("Thread1 "+i);
		});
		tx.start();
	
		tx=new Thread(()->{
			for(int i=2;i<=200;i++)
				System.out.println("\tThread2 "+i);
		});
		tx.start();
	}

}
