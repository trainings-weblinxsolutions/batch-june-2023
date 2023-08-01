package utility;

import java.util.Scanner;

public class ATMUtility {
	public static void main(String[] args) {

		BankAccount account1 = new BankAccount();

		DisplayText.welcomeMessage();

		Scanner scanner = new Scanner(System.in);

		while (true) {

			DisplayText.displayOptions();

			int userInput = scanner.nextInt();

			switch (userInput) {

			case 1:
				account1.printBalance();
				break;
			case 2:
				System.out.println("Enter an amount to deposit:");
				int amountToDeposit = scanner.nextInt();
				account1.deposit(amountToDeposit);
				System.out.println("Updated balance after the deposit is:");
				account1.printBalance();
				break;
			case 3:
				System.out.println("Enter an amount to withdraw:");
				int amountToWithdraw = scanner.nextInt();
				account1.withdraw(amountToWithdraw);
				System.out.println("Updated balance after the withdrawal is:");
				account1.printBalance();
				break;
			case 4:
				System.out.println("Thankyou for transacting with us!");
				break;

			}

			if (userInput == 4) {
				System.out.println("Thankyou user for banking with us, let us know if you have  any feedback");
				break;
			}

		}

		scanner.close();

	}
}
