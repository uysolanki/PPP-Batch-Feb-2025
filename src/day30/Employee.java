package day30;

public class Employee extends Thread
{
	private ICICIBank bank;
	private String empName;
	private double salary;
	public Employee(ICICIBank bank,String empName,double salary)
	{
		this.bank=bank;
		this.empName=empName;
		this.salary=salary;
	}
@Override
public void run() {
	bank.withdraw(this.empName, this.salary);
}
}
