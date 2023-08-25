package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IOMapS {
public static void main(String[] args) {
	List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 2, 4, 5));
	List<Integer> ans = numbers.stream()
            .map(value -> value * 10) //intermediate operation
            .collect(Collectors.toList());

	System.out.println("Result : "+ans);
	
	
	List<Integer> removeDuplicates = numbers.stream()
            .distinct() //intermediate operation
            .collect(Collectors.toList());
	System.out.println("removeDuplicates : "+removeDuplicates);
}
}
