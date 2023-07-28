package utility;

import java.util.Scanner;

public class ScannerReadData {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first number :");
		
		
		String input = sc.next();
		
		int num1;
		try {
			num1 = Integer.parseInt(input);
		} catch (NumberFormatException e) {
			System.out.println("Error!!!! Instead of entering a valid number, you entered an invalid number,"+input+" So setting it to 0");
			//System.out.println(e);
			num1 = 0;
			
		}
		
		System.out.println("Num1 is:"+(num1*2));
		

		sc.close();
	}
}
