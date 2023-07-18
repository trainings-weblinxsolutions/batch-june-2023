package exception_handling;

public class ExceptionsInJava {
public static void main(String[] args) {
	
	
	int a  = 20;
	int b  = 0;
	/*
	 * Exception in thread "main" java.lang.ArithmeticException: / by zero
	at exception_handling.ExceptionsInJava.main(ExceptionsInJava.java:12)

	 */
	
	System.out.println("A is : "+a);
	System.out.println("B is : "+b);
	
	
	if(b==0) {
		System.out.println("Number b is 0, we cannot divide by zero");
	}
	else {
	System.out.println("Division is: "+ (a/b));
	}
	
	
	System.out.println("Addition is: "+ (a+b));
	
	System.out.println("Substraction is: "+ (a-b));
	
	System.out.println("Multiplication is: "+ (a*b));
	
	
	
	int numbers[] = new int[3];
	numbers[0]=10;
	numbers[1]=12;
	numbers[2]=15;
	if(numbers.length > 3)
		numbers[3]=15;
	
	/*
	A is : 20
	B is : 4
	Division is: 5
	Addition is: 24
	Substraction is: 16
	Multiplication is: 80
	*/

	
}
}
