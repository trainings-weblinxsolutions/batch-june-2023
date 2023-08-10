package collections;

import java.util.HashMap;

public class HashMapDemo2 {
public static void main(String[] args) {
	HashMap<String, String> employeeData = new HashMap<String, String>();
    employeeData.put("8", "Prakash"); // Put method
    employeeData.put("31", "Shabaz");
    employeeData.put("12", "Raj ");
    employeeData.put("14", "Praveen");
    employeeData.put("5", "Gopi");
    employeeData.put("31", "Salil");
   
    System.out.println("---KeySet & KeyValues---");
    System.out.println("All keys : "+employeeData.keySet());
    
    System.out.println("All values : "+employeeData.values());
    
    
    System.out.println("---PutAll---");
    HashMap<String, String> employeeData2 = new HashMap<>();
    employeeData2.putAll(employeeData);
    System.out.println("Print emplyeeData2:"+employeeData2);
    
    
    System.out.println("EntrySet : "+employeeData2.entrySet());
    
}
}
