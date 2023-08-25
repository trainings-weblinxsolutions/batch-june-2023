package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TOForEachS {
public static void main(String[] args) {
    final List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

    list.stream()
    	.forEach(System.out::println);//TO

}
}
