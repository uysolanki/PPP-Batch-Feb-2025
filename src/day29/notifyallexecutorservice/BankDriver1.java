package day29.notifyallexecutorservice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BankDriver1 {

	public static void main(String[] args) {
		ICICIBank bank = new ICICIBank(5000.0);

        // Thread pool
        ExecutorService executor = Executors.newFixedThreadPool(4);

        // Submit tasks instead of starting threads
        executor.submit(new Employee(bank, 8000, "Emp-1"));
        executor.submit(new Employee(bank, 7000, "Emp-2"));
        executor.submit(new Employee(bank, 6000, "Emp-3"));

        executor.submit(new Employer(bank));

        executor.shutdown(); 

	}

}
