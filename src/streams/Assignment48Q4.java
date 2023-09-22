package streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Assignment48Q4 {
public static void main(String[] args) {
	 List<Integer> values = Stream.iterate(1, n -> n + 1)
			 					  .limit(50)
			 					  .filter(value -> value % 3 ==0)
			 					  .map(value -> value * 4)
			 					  .filter(value -> value % 7 == 0)
			 					  .collect(Collectors.toList());
	 
	 System.out.println("Values : "+values);
	 
	
}
}
