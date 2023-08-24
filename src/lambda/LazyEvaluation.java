package lambda;

public class LazyEvaluation {
	public static void main(String[] args) {
	    Speaker1 s1 = (name) -> {  
	    	System.out.println("In the lambda part"); //2
	        return "Hello, "+name;  //3
	    };  
	    
	    System.out.println("Executing the program"); // 1
	    System.out.println(s1.say("Java"));//4

		
		
	}
}
