package day30.threadpooling;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class WithPoolDriver {

	public static void main(String[] args) {
		
		ExecutorService executor=Executors.newFixedThreadPool(2); //degree of //el ism is 2
		
		
		executor.submit(new One());
		executor.submit(new Two());
		executor.submit(new Three());
		executor.submit(new Four());
		
		executor.submit(new Five());
		executor.submit(new Six());
		executor.submit(new Seven());
		executor.submit(new Eight());
		
		executor.shutdown();
		
	}

}
