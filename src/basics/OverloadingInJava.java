package basics;
class OverloadingInJava {
  public static void main(String args[]) {
   Calculator c1 = new Calculator();
   
   int marks1 = 10;
   int marks2 = 15;
   
   
   System.out.println(c1.add(10.0,marks2)); 
 
   
   
   
   //System.out.println(c1.add(5,7,9));
//   System.out.println(c1.add(5,7,9,10));   
   
    
    

}

}



class Calculator {



	//2 parameters - add method
	int add(int num1,int num2){
	System.out.println("Return type is int and params are also int");
		return num1+num2;
	}
	
	
	double add(double num1,double num2){
	System.out.println("Return type is double and params are also double");	
		return num1+num2;
	}
	
	
	//  double add(double num1, double num2){
// 	 	System.out.println("Return type is double and params are also double");
//  		return num1+num2;
//  	}
	
	
	

	//This is not allowed as it is similar to the add(int num1, int num2) method
	// double add(int num1, int num2){
// 	
// 	return num1+num2;
// 	}
// 	
	
	// double add(int num1, double num2){
// 		return num1+num2;
// 	
// 	}
	
	
	
	/*	 This is not allowed as it is similar to the add(int num1, int num2) method
	int add(int num3, int num4){
		return num3-num4;
	}
	*/
	
	

	//3 parameters - add method	
	int add(int num1,int num2, int num3){
	
		return num1+num2+num3;
	}
	
	//4 parameters - add method		
	int add(int num1,int num2, int num3, int num4){
	
		return num1+num2+num3+num4;
	}	
	



}
