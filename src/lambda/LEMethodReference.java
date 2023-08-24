package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LEMethodReference {
public static void main(String[] args) {
	List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
	
	numbers.forEach(System.out::print);
	
}
}
