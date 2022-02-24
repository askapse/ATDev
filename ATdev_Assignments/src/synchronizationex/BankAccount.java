package synchronizationex;

public class BankAccount {
	double accountbalance;

	public BankAccount(double amount) {
		this.accountbalance = amount;
	}

	synchronized void deposite(double amt) {
		this.accountbalance += amt;
		System.out.println("Amount " + amt + " is deposited \nCurrent balance is "
				+ this.accountbalance);
	}

	synchronized void transfer(long accountnumber, double amount) {

		this.accountbalance += amount;
		System.out.println("Amount " + amount + " is transfered from the " + accountnumber + "\nCurrent balance is "
				+ this.accountbalance);

	}

	public static void main(String[] args) {
		BankAccount bnk = new BankAccount(1000);

		Thread jack = new Thread(new Runnable() {

			@Override
			public void run() {
				bnk.transfer(12345678, 200);

			}
		});

		Thread jill = new Thread(new Runnable() {

			@Override
			public void run() {
				bnk.deposite(200);
			}
		});
		
		jack.start();
		jill.start();
	}
}
