package basics;
public class FactorialUsingWhileLoop {
   public static void main(String []args) {
 //Write a program to calculate factorial of a number using while loop.
 	int number = 5;
 	int result = 0;
 	
 	while(number >=1){
 	
 		result = result*number;
 		number--;
 	
 	}
 	
 	System.out.println(result);
 	
 	
 
   
}
}