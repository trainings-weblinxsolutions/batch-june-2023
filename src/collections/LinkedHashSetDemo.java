package collections;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
public static void main(String[] args) {
	
	
	LinkedHashSet<Integer> empIds = new LinkedHashSet<>();
	empIds.add(10);
	empIds.add(20);
	empIds.add(30);
	empIds.add(40);
	empIds.add(50);
	empIds.add(60);
	empIds.add(10);
	System.out.println("LinkedHashSet : "+empIds);
	System.out.println("empIds size : "+empIds.size()); //6
	
	empIds.add(70);
	System.out.println("LinkedHashSet : "+empIds);
	empIds.remove(30);
	System.out.println("LinkedHashSet : "+empIds);
	
	


	
	
}
}
