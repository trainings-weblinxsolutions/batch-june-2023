package interview_questions;

public class SumOfDigitsOfANumber {
public static void main(String[] args) {
	int number = 94701;
	//2+7+6 = 15
	
	int sum=0;
	while(number !=0) {
		
		int remainder = number%10; //6 //7//2
		number = number/10; //27 //2 //0
		sum = sum+remainder;//0+6 = 6 //6+7=13//13+2=15
		
	}
	System.out.println("Sum is : "+sum);
	
	
	
	
	
}
}
