package streams;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LazyEvalautionStream {
public static void main(String[] args) {
    Stream<Integer> stream = Stream.of(1, 2, 3)
            .filter(x -> x % 2 == 1)
            .peek(x -> System.out.println("Filtered " + x))
            ;

    System.out.println("Result");
    System.out.println(stream.collect(Collectors.toList()));
    
   

}
}
