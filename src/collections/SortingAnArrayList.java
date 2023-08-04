package collections;

import java.util.ArrayList;
import java.util.Collections;

public class SortingAnArrayList {
public static void main(String[] args) {
	
	
	ArrayList<Integer> numbers = new ArrayList<>();
	numbers.add(11);
	numbers.add(29);
	numbers.add(13);
	numbers.add(41);
	numbers.add(15);
	
	
	System.out.println("Before sorting : "+numbers);
	System.out.println("Element at index 2:"+numbers.get(2));
	
	Collections.sort(numbers);
	
	System.out.println("After sorting : "+numbers);
	System.out.println("Element at index 2:"+numbers.get(2));
	
	System.out.println("------Sorting strings -------");
	
	 ArrayList<String> names = new ArrayList<String>();
	    names.add("Praveen");
	    names.add("Pooja");
	    names.add("Kalyan");
	    names.add("Manish");
	    names.add("Priyanka");
	    
	 System.out.println("Names before sorting : "+names);
	 Collections.sort(names);
	 System.out.println("Names after sorting : "+names);

	    
}
}
