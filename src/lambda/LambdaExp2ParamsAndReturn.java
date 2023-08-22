package lambda;


interface Calculator{  
    int add(int a,int b);  
}  


public class LambdaExp2ParamsAndReturn {
public static void main(String[] args) {
	Calculator ad1 = (a,b) -> (a+b); 
	
	
	 
	
	
    System.out.println("Starting the program");
    System.out.println(ad1.add(5, 7));
    
    
//    Calculator ad2 = (a,b) -> { 
//		System.out.println("In the add execution");
//        return a+b;
//    }; 
//	System.out.println(ad2.add(10, 30));
}
}
