package exception_handling;

public class TryCatchExample {
public static void main(String[] args) {
	
	
	int a = 10;
	int b  = 0;
	System.out.println("Start of program");
	System.out.println("Before");
	try {
		
		System.out.println("Division of a & b is : "+a/b);
		
		
	}
	catch(Exception e) {
		e.printStackTrace();
		System.out.println("There is a problem with the value of b, it cannot be zero");
		
	}
	System.out.println("After");
	System.out.println("End of program");
			
	
	
}
}


/*
 * Start of program
Before
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at exception_handling.WithoutTryCatch.main(WithoutTryCatch.java:9)

 */