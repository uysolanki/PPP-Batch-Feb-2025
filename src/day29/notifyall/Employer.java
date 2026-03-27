package day29.notifyall;

public class Employer extends Thread {
	private ICICIBank bank;

    public Employer(ICICIBank bank) {
        this.bank = bank;
    }

    @Override
    public void run() {

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        bank.deposit(20000);
    }
}
