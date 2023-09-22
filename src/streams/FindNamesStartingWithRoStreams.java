package streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.management.ValueExp;

public class FindNamesStartingWithRoStreams {
public static void main(String[] args) {
	
	List<String> names = new ArrayList<>();
	names.add("Rohit");
	names.add("Rakesh");
	names.add("Rohan");
	names.add("Roshan");
	names.add("Ramit");
	
	Stream<String> stream = names.stream()
								 .filter(value -> value.contains("Ro"));
	System.out.println(stream.collect(Collectors.toList()));
	
}
}
