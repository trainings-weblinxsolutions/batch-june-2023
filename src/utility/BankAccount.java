package utility;

public class BankAccount {

	private int balance;

	BankAccount() {
		this.balance = 1000;
	}

	public void deposit(int amount) {

		balance = balance + amount;
	}


	public void withdraw(int amount) {

		balance = balance - amount;
	}

	public void printBalance() {
		System.out.println("The current balance in your account is :" + balance);
	}

}
