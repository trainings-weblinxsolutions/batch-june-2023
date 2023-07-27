package helperclasses;

public class UtilityClasses {
public static void main(String[] args) {
	
	long start = System.currentTimeMillis();
	int number = 20;
	int factorial = 1;
	
	
	for(int j = 1; j < number ;j ++) {
	
	for(int i=1;i<=j;i++) {
		factorial = factorial *i;
		
	}
	
	System.out.println("Factorial of number: "+j +"is :"+factorial);
	factorial=1;
	}
	
	
	long end = System.currentTimeMillis();
	System.out.println("Time taken for my program to run : "+ (end - start) + " ms");
	
	
}
}
