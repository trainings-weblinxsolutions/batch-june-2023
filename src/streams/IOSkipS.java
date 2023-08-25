package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IOSkipS {
public static void main(String[] args) {
	List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

     List<Integer> ans = list.stream()
            .skip(2)
            .collect(Collectors.toList());
     
     System.out.println("Res :"+ans);

}
}
