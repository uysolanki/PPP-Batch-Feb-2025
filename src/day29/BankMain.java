package day29;

public class BankMain {

	public static void main(String[] args) {
		HDFCBAnk bank=new HDFCBAnk(5000.0);
		
		Son thread1=new Son(bank);
		Father thread2=new Father(bank);
		
		thread1.start();
		thread2.start();
	}

}
