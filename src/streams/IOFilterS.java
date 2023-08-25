package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IOFilterS {
public static void main(String[] args) {
	List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
	List<Integer> evenNumbers = numbers.stream()
									   .filter(value -> value % 2 == 0)
									   .collect(Collectors.toList());
	System.out.println("Even Numbers : "+evenNumbers);

}
}
