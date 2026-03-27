package day30;

public class BankMain {

	public static void main(String[] args) {
		ICICIBank bank=new ICICIBank(5000.0);
		
		Employee empthread1=new Employee(bank, "Nitin", 8000.0);
		Employee empthread2=new Employee(bank, "Vedant", 10000.0);
		Employee empthread3=new Employee(bank, "Anil", 12000.0);
		
		
		Employer coowner=new Employer(bank);
		
		empthread1.start();
		empthread2.start();
		empthread3.start();
		coowner.start();
	}

}
