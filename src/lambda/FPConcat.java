package lambda;

@FunctionalInterface
interface Concatenator {
    String concat(String s1, String s2);
}


public class FPConcat {
public static void main(String[] args) {
	
	// Function stored in a variable
    Concatenator concatenator = (s1, s2) -> s1 + s2;
    
   // System.out.println(concatenator.concat("Hello", " World!"));
    execute(concatenator);

	
	
	
	
	
}


public static void execute(Concatenator concatenator) {
    String res =  concatenator.concat("Hello", " World!");
    System.out.println(res);
 }

}
