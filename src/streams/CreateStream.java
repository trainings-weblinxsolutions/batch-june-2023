package streams;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CreateStream {
public static void main(String[] args) {
	//Empty stream
    Stream<Integer> stream = Stream.empty();
   
    
    System.out.println("Size: " + stream.count());
  
    
    
    //Stream Builder
    Stream.Builder<String> builder = Stream.builder();
    builder.add("Tony Stark").add("Steve Rogers").add("Thor Odinson");
    builder.add("All Avengers");
    
    Stream<String> streamAv = builder.build();
    streamAv.forEach(System.out::println);

    //Stream of
    Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5);
    System.out.println("Size: " + stream1.count());
    
    
    Integer[] array = new Integer[] {1, 2, 3, 4, 5};

    Stream<Integer> streamUsingArray = Arrays.stream(array);

    System.out.println("Size: " + streamUsingArray.count());
    
    
    //Concat method
    System.out.println("--Concat--");
    Stream<Integer> stream_1 = Stream.of(1, 2, 3);
    Stream<Integer> stream_2 = Stream.of(4, 5);
    Stream<Integer> stream_3 = Stream.concat(stream_1, stream_2);
    System.out.println("Elements of concatenated stream");
    stream_3.forEach(System.out::println);
    
    
    
    //generate method
    System.out.println("---Genertae Method ---");
    List<UUID> uuids = Stream.generate(UUID::randomUUID) //infinite
            .limit(10)
            .collect(Collectors.toList());
    System.out.println("UUIDS: "+uuids);

    //unaryOperator
    System.out.println("---Unary Method ---");

    List<Integer> values = Stream.iterate(1, n -> n * 2)
            .limit(15)
            .collect(Collectors.toList());
    System.out.println("Values : "+values);



    

    

}
}
