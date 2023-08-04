package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorInArrayList {
public static void main(String[] args) {
	
    ArrayList<String> names = new ArrayList<String>();
    names.add("Praveen");
    names.add("Pooja");
    names.add("hdufhd");
    names.add("Kalyan");
    names.add("Manish");
    names.add("Priyanka");
    System.out.println("Names of students : "+names +" ,and size is :"+names.size());
    
    names.remove("hdufhd");
    //names.remove(2);
    System.out.println("Names of students : "+names +" ,and size is :"+names.size());

    System.out.println("-----Using iterator to iterate over the ArrayList-----");
    Iterator<String> iterator = names.iterator();
    while(iterator.hasNext())
    {
        System.out.println(iterator.next());
    }    
    
    System.out.println("-------Using a for loop-----");
    for(String name:names) {
    	System.out.println(name);
    }
    
	
	
}
}
