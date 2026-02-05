package day2;

public interface RunningBird {
	void fly();
	
	default void method1()
	{
		System.out.println("Implementaion of Default 1 in Running Bird");
	}
}
