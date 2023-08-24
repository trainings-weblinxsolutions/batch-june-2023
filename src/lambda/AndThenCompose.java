package lambda;

import java.util.function.Function;

public class AndThenCompose {
public static void main(String[] args) {
	Function<String, String> appendX = (value) -> value + "-X";
	Function<String, String> appendY = (value) -> value + "-Y";
	
	Function<String, String> appendXAndThenY = appendX.andThen(appendY);
	Function<String, String> appendYAndThenX = appendX.compose(appendY);
	
	
	System.out.println("andThen: " + appendXAndThenY.apply("A"));
	System.out.println("compose: " + appendYAndThenX.apply("A"));
	
	

}
}
