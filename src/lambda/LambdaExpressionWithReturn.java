package lambda;
interface speaker {
	  public String say();
	}



public class LambdaExpressionWithReturn {
	public static void main(String[] args) {
		speaker s = () -> {
			System.out.println("Hello!");
		      return "Welcome to Lambda Expressions.";
		    };
		    
		System.out.println(s.say());

	}

}
