package streams;

import java.util.stream.Stream;

public class TOMinMaxS {
public static void main(String[] args) {
    Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
    int minimum = stream.min((a, b) -> Integer.compare(a, b)).get();
    System.out.println("Minimum: " + minimum);

    stream = Stream.of(1, 2, 3, 4, 5);
    int maximum = stream.max((a, b) -> Integer.compare(a, b)).get();
    System.out.println("Maximum: " + maximum);
    
    

}
}
