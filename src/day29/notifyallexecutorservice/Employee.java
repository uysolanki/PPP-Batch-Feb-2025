package day29.notifyallexecutorservice;

public class Employee implements Runnable {
	private ICICIBank bank;
    private double amount;
    private String name;

    public Employee(ICICIBank bank, double amount, String name) {
        this.bank = bank;
        this.amount = amount;
        this.name = name;
    }

    @Override
    public void run() {
        bank.withdraw(amount, name);
    }
}
