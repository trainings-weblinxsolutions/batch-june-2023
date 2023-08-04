package collections;

import java.util.ArrayList;

public class ArrayListExample {
public static void main(String[] args) {
	
	int a[] = {1,2,3,4,5};
	a[2]=18;
	System.out.println(a[4]);
	
	//a[5]=15; IndexOutOfBoundsException
	
	System.out.println("----ArrayList----");
	
	
	ArrayList<Integer> numbers = new ArrayList<>();
	//There is a class ArrayList
	//It has one type parameter
	//Integer
	//numbers
	numbers.add(1);
	numbers.add(2);
	numbers.add(3);
	numbers.add(4);
	numbers.add(5);
	System.out.println("My array list : "+numbers);
	
	numbers.add(15);
	numbers.add(20);
	
	numbers.add(25);
	numbers.add(50);
	System.out.println("My array list : "+numbers);
	
	
	
	
	
	
}
}
