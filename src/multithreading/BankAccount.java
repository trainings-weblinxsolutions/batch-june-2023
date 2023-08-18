package multithreading;

public class BankAccount {

	double balance;

	public BankAccount(double balance) {
		this.balance = balance;

	}

	public void deposit(double amt) {
		double temp = balance;
		temp = temp + amt;
		try {
			Thread.sleep(300); // simulate production time
		} catch (InterruptedException ie) {
			System.err.println(ie.getMessage());
		}
		System.out.println("after deposit balance = $" + temp);
		balance = temp;
	}

	public void withdraw(double amt) {
		if (balance < amt) {
			System.out.println("Insufficient funds!");
			return;
		}
		double temp = balance;
		temp = temp - amt;
		try {
			Thread.sleep(200); // simulate consumption time
		} catch (InterruptedException ie) {
			System.err.println(ie.getMessage());
		}
		System.out.println("after withdrawl balance = $" + temp);
		balance = temp;
	}

}



class Producer extends Thread {
	   private BankAccount account;
	   public Producer(BankAccount acct) { account = acct; }
	   public void run() {
	      for(int i = 0; i < 5; i++) {
	    	  synchronized(account) { 
	         account.deposit(10);
	    	  }
	      }
	      
	      //code
	      //code
	   }
	}

class Consumer extends Thread {
	   private BankAccount account;
	   public Consumer(BankAccount acct) { account = acct; }
	   public void run() {
	      for(int i = 0; i < 5; i++) {
	    	  synchronized(account) { 
	         account.withdraw(10);
	    	  }
	      }
	   }
	}


