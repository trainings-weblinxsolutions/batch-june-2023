package collections;

import java.util.HashMap;

public class HashMapDemo {
public static void main(String[] args) {
	
	HashMap<String, String> employeeData = new HashMap<String, String>();
	System.out.println("---Put Method in Maps---");
    employeeData.put("8", "Prakash"); // Put method
    employeeData.put("31", "Shabaz");
    employeeData.put("12", "Raj ");
    employeeData.put("14", "Praveen");
    employeeData.put("5", "Gopi");
    employeeData.put("31", "Salil");
    System.out.println("After Employee Data : "+employeeData + " ,Size of Map : "+employeeData.size());

    System.out.println("-----Get Method in Maps----");
    System.out.println("Value present at key-12 : "+employeeData.get("12"));
    
    
    System.out.println("---containsKey ---");
    System.out.println("Contains Key : "+employeeData.containsKey("5"));
    
    System.out.println("---containsValue ---");
    System.out.println("Contains Value : "+employeeData.containsValue("Shabaz")); //false
    
    
    System.out.println("---remove---");
    employeeData.remove("5");
    System.out.println("Map After removing : "+employeeData);
    
    System.out.println("---isEmpty and clear");
    employeeData.clear();
    System.out.println("IsEmpty ? :"+employeeData.isEmpty());

	
	
}
}
