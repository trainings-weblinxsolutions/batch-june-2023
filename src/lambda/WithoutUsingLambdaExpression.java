package lambda;

@FunctionalInterface
interface MyName{  
     public void SayMyName();
}  

 


public class WithoutUsingLambdaExpression {
public static void main(String[] args) {

	//without lambda, MyName implementation
	
	//anonymous classes
	
	
	MyName person = new MyName(){
        public void SayMyName(){
        System.out.println("Himanshu");
        }

		
    };  
    
    person.SayMyName();

	
}
}



