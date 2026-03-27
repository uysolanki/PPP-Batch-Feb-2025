package day29.notifyall;

public class BankDriver1 {

	public static void main(String[] args) {
		ICICIBank bank = new ICICIBank(5000.0);

        // 3 employees trying to withdraw
        Employee e1 = new Employee(bank, 8000, "Emp-1");
        Employee e2 = new Employee(bank, 7000, "Emp-2");
        Employee e3 = new Employee(bank, 6000, "Emp-3");

        // Owner depositing money
        Employer owner = new Employer(bank);

        e1.start();
        e2.start();
        e3.start();
        owner.start();

	}

}
