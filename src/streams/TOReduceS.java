package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TOReduceS {
public static void main(String[] args) {
	List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
	
	int ans = list.stream()
				  .reduce(9, (value, sum) -> sum += value);
	System.out.println("Sum :"+ans);
}
}
