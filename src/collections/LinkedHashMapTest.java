package collections;

import java.util.LinkedHashMap;

public class LinkedHashMapTest {
public static void main(String[] args) {
	LinkedHashMap<String, String> lhm = new LinkedHashMap<String, String>();
    lhm.put("Ramesh", "Intermediate");
    lhm.put("Shiva", "B-Tech");
    lhm.put("Santosh", "B-Com");
    lhm.put("Asha", "Msc");
    lhm.put("Raghu", "M-Tech");
    System.out.println("LHM : "+lhm);

}
}
