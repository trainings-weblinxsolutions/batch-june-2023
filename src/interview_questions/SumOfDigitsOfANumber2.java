package interview_questions;

public class SumOfDigitsOfANumber2 {
public static void main(String[] args) {
	
	
	int number = 123;//6
	
	String input = number+"";
	int sum=0;
	System.out.println((int)'0');// --48
	System.out.println((int)'1'); //49
	System.out.println((int)'2');//50
	System.out.println((int)'3');//51
	
	for(char c:input.toCharArray()) {
		sum = sum+c-48;
	}
	System.out.println("Sum is:"+sum);
	
	
}
}
