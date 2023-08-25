package streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TOCollectorS {
public static void main(String[] args) {
    List<Integer> evenList = Stream.of(1, 2, 3, 4, 5)
            .filter(x -> x % 2 == 0)
            .collect(Collectors.toList());
    
    //2,4

    System.out.println(evenList);

}
}
