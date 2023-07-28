package utility;

import java.util.Scanner;

public class SumOfNumbersBetterWay {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter comma separated numbers :");
	String numbers = sc.next();
	
	String input[] = numbers.split(",");
	int res=0;
	for(String number:input) {
		res = res + Integer.parseInt(number);
		
	}
	
	System.out.println("Res is:"+res);
	
	
	
	
	sc.close();
}
}
