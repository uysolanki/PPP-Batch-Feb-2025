package day29.notifyall;

public class Employee extends Thread {
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
