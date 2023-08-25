package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MonadsLE {
public static void main(String[] args) {
	List<String> names = new ArrayList<>();
	names.add("J");
	names.add("A");
	names.add("V");
	names.add("A");
	Optional<String> concat = Optional.of(names).flatMap(a -> Optional.of("B").flatMap(b -> Optional.of(a + b)));
        
        System.out.println(concat.get());
        //[A]B
        //[J][A][V][A]B
        //[J,A,V,A]B

}
}
