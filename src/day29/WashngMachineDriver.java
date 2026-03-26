package day29;

public class WashngMachineDriver {

	public static void main(String[] args) throws InterruptedException {
		Soak thread1=new Soak();
		Wash thread2=new Wash();
		Dry thread3=new Dry();
		
		thread1.start();		//5 sec
		thread1.join(4000,20);
		thread2.start();
		thread2.join();	
		thread3.start();
	}

}
