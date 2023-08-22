package lambda;

@FunctionalInterface
interface MyAddress{  
     public void m1();
}  

public class LambdaExpressionExample {
public static void main(String[] args) {
	
	//Lambda expression - No parameter
	
	MyAddress p2 = () -> {  System.out.println("Himanshu Yadav");  
	
							int a=10;  
							System.out.println("Multiply a and 2:"+(a*2));
							
						 };
	
	MyAddress p3 = () -> {  System.out.println("Java Lambda expressions");  };
	
	
	
	p2.m1();
	p3.m1();
	
	
	System.out.println("End of program");
	
	
	
}
}
