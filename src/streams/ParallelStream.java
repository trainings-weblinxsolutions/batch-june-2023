package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStream {
public static void main(String[] args) {
	Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5,6,7,8,9,10);
    
    stream.parallel().forEach(System.out::println);
	//stream.forEach(System.out::println);
    
    System.out.println("-----ParallelStream----");
    
    List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

    list.parallelStream().forEach(System.out::println);


}
}
