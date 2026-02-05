package day2;

public interface FlyingBird {
	void fly();
	
	default void method1()
	{
		System.out.println("Implementaion of Default 1 in Flying Bird");
	}
}
