package day29.notifyallexecutorservice;

public class ICICIBank {
	 private double balance;

	    public ICICIBank(double balance) {
	        this.balance = balance;
	    }

	    // Deposit
	    public synchronized void deposit(double amount) {

	        System.out.println("Owner depositing: " + amount);

	        balance += amount;

	        System.out.println("New Balance: " + balance);

	        notifyAll(); // 🔥 wake all waiting employees
	    }

	    // Withdraw
	    public synchronized void withdraw(double amount, String name) {

	        while (amount > balance) {

	            System.out.println(name + " trying to withdraw " + amount);
	            System.out.println("Insufficient balance: " + balance);
	            System.out.println(name + " waiting...\n");

	            try {
	                wait();
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }

	        balance -= amount;

	        System.out.println(name + " SUCCESSFULLY withdrew " + amount);
	        System.out.println("Remaining Balance: " + balance + "\n");
	    }
}
