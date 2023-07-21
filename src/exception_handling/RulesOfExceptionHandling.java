package exception_handling;

public class RulesOfExceptionHandling {
public static void main(String[] args) {
	
	
	// Rule 1 - •	Every try should have a catch or finally block. We can not have a catch or finally block with out the try block.
	try {
		
	}

	catch(Exception e) {
		
	}
	finally {
		
	}
	
	// Rule 2 - A try can have multiple catch blocks but it can have only one finally block.
	try {
		
	}
	catch(ArithmeticException e) {
		
	}
	catch(Exception e) {
		
	}
	finally {
		
	}
	
	//Rule 3  -	When we have multiple catch blocks for a try block, the sub-classes must be caught first and then the super-classes.
	
	try {
		
	}
	catch(ArithmeticException e) {
		
	}
	catch(Exception e) {
		
	}
	finally {
		
	}
	
	// Rule 4 - 	try blocks could be nested. We can have try blocks inside a catch block or inside a finally block.
	try {
		try {
			
		}
		catch(ArithmeticException e) {
			
		}
		catch(Exception e) {
			
		}
		finally {
			
		}
	}
	catch(ArithmeticException e) {
		
	}
	catch(Exception e) {
		
	}
	finally {
		
	}
	
}
}
