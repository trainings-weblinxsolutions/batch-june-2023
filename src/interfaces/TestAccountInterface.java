package interfaces;

public class TestAccountInterface {
public static void main(String[] args) {
	
	
	
	IAccount account = new HDFCAccount();
    
    System.out.println("Transacting using HDFC Account");
    transactOnAccount(account);
    System.out.println();

    account = new StateBankAccount();

    System.out.println("Transacting using State Bank Account");
    transactOnAccount(account);

}
public static void transactOnAccount(IAccount account)
{
    System.out.println("------------------------------");
    account.deposit(10000.0);
    printBalance("depositing 10,000.0", account);
    account.withdraw(2500.0);
    printBalance("withdrawing 2,500.0", account);
    account.withdraw(4100.0);
    printBalance("withdrawing 4,100.0", account);
    account.deposit(5000.0);
    printBalance("depositing 5,000.0", account);
    System.out.println("------------------------------");
}
public static void printBalance(String message, IAccount account)
{
    System.out.println("The balance after " + message + " is " + account.getBalance() +".");
}

}
interface IAccount
{
    double getBalance();

    void deposit(double amount);

    void withdraw(double amount);
}

class HDFCAccount implements IAccount
{
    double deposits;
    double withdrawals;


    public double getBalance()
    {
        return deposits - withdrawals;
    }

    public void deposit(double amount)
    {
        deposits += amount;
    }

    public void withdraw(double amount)
    {
        withdrawals += amount;
    }
}

class StateBankAccount implements IAccount
{
    double balance;

    public double getBalance()
    {
        return balance;
    }

    public void deposit(double amount)
    {
        balance += amount;
    }

    public void withdraw(double amount)
    {
        balance -= amount;
    }
}

