package collections;

import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapTest {
public static void main(String[] args) {
    Map weakmap=  (Map) new WeakHashMap();
    
    String one=new String("one");
    String two=new String("two");
    weakmap.put(one, "Lahari");
    weakmap.put(two, "Latha");
    System.gc();
    System.out.println("Before: "+weakmap.get("one")+" "+weakmap.get("two"));
    one=null;
    two=null;
     System.gc();
    System.out.println("After: "+weakmap.get("one")+" "+weakmap.get("two"));   

}
}
