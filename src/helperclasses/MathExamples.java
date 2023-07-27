package helperclasses;

public class MathExamples {
public static void main(String[] args) {
	
	
	int number = 48;
	//Square root 
	
	
	for(int i=1;i<number;i++) {
		if(i*i == number) {
			System.out.println("Square root of :"+number + " is : "+i);
			break;
		}
		
	}
	System.out.println("End of program");
	
	System.out.println(Math.sqrt(49));
	System.out.println(Math.sqrt(48));
	
	
	int a = 10;
	int b= 15;
	System.out.println(Math.max(a, b));
	
	
}
}
