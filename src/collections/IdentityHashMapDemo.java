package collections;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapDemo {
public static void main(String[] args) {
	HashMap<Integer,String> hm = new HashMap();
    Integer i1 = new Integer(10);
    Integer i2 = new Integer(10);
    hm.put(i1, "Sachin");
    hm.put(i2, "Dravid");
    System.out.println(hm);
    
    IdentityHashMap ihm = new IdentityHashMap();
    ihm.put(i1, "Sachin");
    ihm.put(i2, "Dravid");
    System.out.println(ihm);
    Integer i3 = new Integer(10);
    System.out.println(ihm.get(i2));


}
}
