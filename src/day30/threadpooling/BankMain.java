package day30.threadpooling;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BankMain {

	public static void main(String[] args) {
		ICICIBank bank=new ICICIBank(5000.0);
		
		ExecutorService executor=Executors.newFixedThreadPool(4); //degree of //el ism is 4
		
		Employee empthread1=new Employee(bank, "Nitin", 8000.0);
		Employee empthread2=new Employee(bank, "Vedant", 10000.0);
		Employee empthread3=new Employee(bank, "Anil", 12000.0);
		
		
		Employer coowner=new Employer(bank);
		
		executor.submit(empthread1);
		executor.submit(empthread2);
		executor.submit(empthread3);
		executor.submit(coowner);
		
		executor.shutdown();
		
		
	}

}
