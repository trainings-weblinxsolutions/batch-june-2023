package utility;

import java.util.Scanner;

public class ScannerDemo {
public static void main(String[] args) {
	//Add two numbers, take the input from the user
	
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter first number :");
	
	
	
	int num1 = sc.nextInt();
	
	
	System.out.println("Enter second number :");
	
	int num2 = sc.nextInt();
	
	System.out.println("Total of these numbers is : "+ (num1 + num2));
	
	
	
	
	sc.close();
}
}
