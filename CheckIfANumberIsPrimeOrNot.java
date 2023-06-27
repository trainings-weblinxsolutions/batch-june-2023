public class CheckIfANumberIsPrimeOrNot {
   public static void main(String []args) {


	int number = 2;
	
	boolean flag = true;
	
	for(int i=2 ; i < number ; i++) {
	
		System.out.println("In for loop");
	
		if(number % i ==0){
			flag = false;
		
			break;
		}
	
	}
	
	if(flag){
		System.out.println("Number is Prime");
	}
	else{
		System.out.println("Number is not Prime");
	}	





/*

-- For number 14, the for loop will run 14 times to check from i=1 to i=14

	int number = 14;
	
	int count=0;
	
	for(int i=1 ; i<=number ; i++){
		System.out.println("In for loop");
	
		if(number % i == 0){
			count++;
		}
	
	}
	
	if(count == 2){
		System.out.println("Number is Prime");
	}
	else{
		System.out.println("Number is not Prime");
	}
	
	*/
	
   
   }
}
   