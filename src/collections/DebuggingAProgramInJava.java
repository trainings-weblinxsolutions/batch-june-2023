package collections;

public class DebuggingAProgramInJava {
public static void main(String[] args) {
	
	
	int countOfEvenNumbers = 0;
	int countOfOddNumbers = 0;
	
	for(int i=1;i<=5;i++) {
		
		
		if(i%2==0) {
			countOfEvenNumbers++;
		}
		else {
			countOfOddNumbers++;
		}
		
	}
	System.out.println("countOfEvenNumbers : "+countOfEvenNumbers);
	System.out.println("countOfOddNumbers : "+countOfOddNumbers);
	
	
}
}
