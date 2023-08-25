package lambda;

import java.util.function.Function;

public class Currying {
public static void main(String[] args) {
   Function<String, Function<String, String>> concatCurried    = a -> b -> a + b;

   System.out.println(concatCurried.apply("Hello").apply(" World!"));
   
   
   
   // System.out.println("concatTraditional: " + concatTraditional("A", "B"));
   // System.out.println("concatCurried: " + concatCurried.apply("A").apply("B"));

}

public static String concatTraditional(String a, String b) {
    return a + b;
}

}
