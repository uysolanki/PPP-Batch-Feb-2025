package day30.threadpooling;

public class WithoutPoolDriver {

	public static void main(String[] args) {
	One thread1=new One();
	Two thread2=new Two();
	Three thread3=new Three();
	Four thread4=new Four();
	Five thread5=new Five();
	Six thread6=new Six();
	Seven thread7=new Seven();
	Eight thread8=new Eight();
	
	thread1.start();
	thread2.start();
	thread3.start();
	thread4.start();
	thread5.start();
	thread6.start();
	thread7.start();
	thread8.start();
	}

}
