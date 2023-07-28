package utility;

import java.util.Scanner;

public class SumOfNumbersUsingWhile {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many numbers you want to add ? ");
		int numbersToAdd = sc.nextInt();
		
		int i=1;
		int res=0;
		while(i<=numbersToAdd) {
			res = res + sc.nextInt();
			i++;
			
		}
		
		System.out.println("Res is :"+res);
		
		
		sc.close();
	}
}
