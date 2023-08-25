package lambda;

import java.util.Optional;

public class OptionalExample {
public static void main(String[] args) {
	
	
	Integer val1 = null;
	Integer val2= new Integer(10);
	
	Optional<Integer> a = Optional.ofNullable(val1);
	Optional<Integer> b = Optional.of(val2);
	System.out.println("Sum of a and b:"+sum(a,b)); //

}

private static Integer sum(Optional<Integer> a, Optional<Integer> b) {
	
	System.out.println(a.isPresent());
	System.out.println(b.isPresent());
	
	Integer num1 = a.orElse(new Integer(15)); //15
	Integer num2 = b.orElse(new Integer(27)); //10
	
	
	return num1/num2;
}
}
