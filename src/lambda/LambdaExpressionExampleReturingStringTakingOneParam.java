package lambda;


interface Speaker1{  
    public String say(String name);  
}  



public class LambdaExpressionExampleReturingStringTakingOneParam {
public static void main(String[] args) {
    Speaker1 s1 = (name) -> {  
        return "Hello, "+name;  
    };  
    
    System.out.println(s1.say("Java"));

	
	
}


}
