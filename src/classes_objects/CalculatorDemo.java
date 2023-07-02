package classes_objects;
class CalculatorDemo {
  public static void main(String args[]) {
   
     Calculator c1 = new Calculator();
     
     System.out.println(c1.square(17));
     
     int result = c1.square(25);
     System.out.println(result);
     
     
    System.out.println("Adding two numbers : "+ (c1.add(7,8)));
    
    // Improve this code, to add methods such a multiplication, division and subtraction
    

}

}



class Calculator {

	
	
	int square(int number){
	
		return number * number;
	}
	
	
	int add(int num1, int num2){
	
		return num1+num2;
	}
	
 /*
 	int square(){
 	
 		return 10*10;
 	}
  */
  
}
