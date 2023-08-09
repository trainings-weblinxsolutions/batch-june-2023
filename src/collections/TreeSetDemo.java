package collections;

import java.util.TreeSet;

public class TreeSetDemo {
public static void main(String[] args) {
	
	
	TreeSet<Integer> input = new TreeSet<Integer>(); // LINE A
    input.add(10);
    input.add(3);
    input.add(2);
    input.add(6);
    input.add(5);
    input.add(4);
    System.out.println(input); 
    System.out.println("Size of the input : "+input.size());
    
    
    
    System.out.println("First Element in Set : " + input.first()); // LINE C
    System.out.println("Last Element in Set : " + input.last()); // LINE D
    System.out.println("Element higher to 4 : " + input.higher(7)); // LINE E
    //higher returns the next higher number to the given number
    System.out.println("Element lower to 3 : " + input.lower(7));
    //lower returns the next lower number to the given number   
    
    
    TreeSet<String> names = new TreeSet<>();
    names.add("Priyanka");
    names.add("Pooja");
    names.add("Praveen");
    names.add("Manish");
    names.add("Urja");
    names.add("Prudhvi");
    //M
    
    System.out.println("Names : "+names);

}
}
