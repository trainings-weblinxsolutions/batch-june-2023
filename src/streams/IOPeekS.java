package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IOPeekS {
public static void main(String[] args) {
	List<Integer> num = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
	List<Integer> ans = num.stream()
            .filter(value -> value % 2 == 0)
            .peek(value -> System.out.println("Filtered " + value))
            .map(value -> value * 10)
            .collect(Collectors.toList());
	
	System.out.println("Res ::"+ans);

}
}
