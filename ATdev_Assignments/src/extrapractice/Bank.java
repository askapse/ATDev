package extrapractice;

public class Bank {
	int amount;
	public int getBalance() {
		return amount;
	}
	
	
	public static void main(String[] args) {
		Bank a  = new BankA(1000);
		Bank b = new BankB(1500);
		Bank c = new BankC(2000);
		
		System.out.println(a.getBalance());
		System.out.println(b.getBalance());
		System.out.println(c.getBalance());
	}
}

class BankA extends Bank{
	BankA(int amt){
		super.amount = amt;
	}
}

class BankB extends Bank{
	BankB(int amt){
		super.amount = amt;
	}
}

class BankC extends Bank{
	BankC(int amt){
		super.amount = amt;
	}
}