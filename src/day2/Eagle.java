package day2;

public class Eagle implements RunningBird,FlyingBird
{
	public void fly()
	{
		System.out.println("Eagle Flying");
	}
	

	@Override
	public void method1() {
		//RunningBird.super.method1();
		System.out.println("My own implementation");
	}
	
	
}
