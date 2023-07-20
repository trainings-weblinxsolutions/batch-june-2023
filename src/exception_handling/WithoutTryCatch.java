package exception_handling;

public class WithoutTryCatch {
public static void main(String[] args) {
	int a = 10;
	int b  = 0;
	System.out.println("Start of program");
	System.out.println("Before");
	System.out.println("Division of a & b is : "+a/b);
	System.out.println("After");
	System.out.println("End of program");
}
}
/*
Start of program
Before
Division of a & b is : 5
After
End of program
*/


/*
Start of program
Before
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at exception_handling.WithoutTryCatch.main(WithoutTryCatch.java:9)
*/