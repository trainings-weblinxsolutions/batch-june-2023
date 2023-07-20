package exception_handling;

public class HandlingMultipleExceptions {
	public static void main(String[] args) {
		
		int a  = 20;
		int b  = 2;
		
		int numbers[]= {1,4,5};
		
		
		try {
			
			System.out.println(a/b);
			System.out.println(numbers[12]);
			
		} catch (ArithmeticException e) {
			
			System.out.println("There is a problem with the value of b, it cannot be zero");

		}
		catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Index not in range, please try to print an index in range");

		}
		System.out.println("After");
		System.out.println("End of program");
		
		
		/*
		 * 5
There is a problem with the value of b, it cannot be zero
Index not in range, please try to print an index in range

		 */
		
		
		
	}

}
