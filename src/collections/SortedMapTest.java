package collections;

import java.util.TreeMap;

public class SortedMapTest {
public static void main(String[] args) {
	TreeMap<String, Double> tm = new TreeMap<String, Double>();
    tm.put("Santosh", new Double(3020.55));
    tm.put("Ram", new Double(2550.22));
    tm.put("Nishan", new Double(2060.66));
    tm.put("Amar", new Double(1890.88));
    tm.put("Om", new Double(1650.11));
    tm.put("Abhishek", new Double(1650.11));
    
    System.out.println("TreeMap : "+tm);
    System.out.println("First key : " + tm.firstKey());
    System.out.println("Last key : " + tm.lastKey());
    
    
    System.out.println("HeadMap, tailMap and subMap");
    System.out.println("Head map : " + tm.headMap("Om"));
    System.out.println("Sub map : " + tm.subMap("Nishan", "Santosh"));
    System.out.println("Tail map : " + tm.tailMap("Om"));
    




}
}
