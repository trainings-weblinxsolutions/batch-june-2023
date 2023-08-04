package collections;

import java.util.ArrayList;

public class ArrayListMethods {
public static void main(String[] args) {
	ArrayList<Integer> numbers = new ArrayList<>();
	numbers.add(11);
	numbers.add(29);
	numbers.add(13);
	numbers.add(41);
	numbers.add(15);
	
	//Method 1- size
	System.out.println("No of elements in the array list is : "+numbers.size());
	

	//Method 2 - contains
	int elementToCheck = 14;
	System.out.println("Element present ? :"+numbers.contains(elementToCheck));
	
	
	//Method 3 - add(index,integer)
	System.out.println("Before adding : "+numbers);
	numbers.add(2,98);
	System.out.println("After adding : "+numbers);
	
	
	//Method 4  - get
	System.out.println("Get an element at an index : "+numbers.get(4)); //a[3] a[4]
	
	//Method 5 - indexOf(value)
	System.out.println("Get index of an element : "+numbers.indexOf(14));//
	
	
	//Method 6 - isEmpty
	System.out.println("Is array List empty ? :"+numbers.isEmpty());
	
	//Method 7 - remove
	System.out.println("Before removing : "+numbers);
	numbers.remove(2);
	System.out.println("After removing : "+numbers);
	
	//Method 8 - clear
	numbers.clear();
	System.out.println("After clearing arraylist: "+numbers);
	System.out.println("Is array List empty ? :"+numbers.isEmpty());
	
	
	
}
}
