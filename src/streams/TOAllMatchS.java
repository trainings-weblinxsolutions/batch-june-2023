package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TOAllMatchS {
public static void main(String[] args) {
	List<Integer> list = new ArrayList<>(Arrays.asList(1, 1,1,1,1));

    boolean isAllEven = list.stream().allMatch(value -> value == 1);

    System.out.println("Is all even: " + isAllEven);
    
    
    List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2,3,4,5));

    boolean anyMatch = list1.stream().anyMatch(value -> value == 15);

    System.out.println("AnyMatch: " + anyMatch);

}
}
