package collections;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
	    Stack<Integer> numbers = new Stack<>();
	    //insert elements into stack
	    numbers.push(10);
	    numbers.push(20);
	    numbers.push(30);
	    numbers.push(40);
	    numbers.push(50);
	    System.out.println("Stack Elements : "+numbers);
	    System.out.println("Size of stack : "+numbers.size());
	    
	    System.out.println("--- Pop method ---");
	    
	    System.out.println(numbers.pop());
	    
	    System.out.println("Size of stack : "+numbers.size());

	    System.out.println("--- Peek method ---");
	    
	    System.out.println(numbers.peek());
	    
	    System.out.println("Size of stack : "+numbers.size());
	    
	    
	    System.out.println("--- Search method--");
	    Integer valueToCheck = new Integer(14);
	    System.out.println("Check for 20? : "+numbers.search(valueToCheck));

	    
	    System.out.println("---Is Empty---");
	    numbers.clear();
	    System.out.println("Stack empty? :"+numbers.isEmpty());
	    
	    
	    
	}

}
