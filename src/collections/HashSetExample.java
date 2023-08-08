package collections;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetExample {
public static void main(String[] args) {
	
	ArrayList<Integer> numbers = new ArrayList<>();
	System.out.println("AL add method, add 10?:"+numbers.add(10));
	numbers.add(20);
	numbers.add(30);
	numbers.add(40);
	numbers.add(10);
	System.out.println("ArrayList : "+numbers);
	System.out.println("Numbers size : "+numbers.size()); //4
	System.out.println("--------------------------------------");
	HashSet<Integer> empIds = new HashSet<>();
	System.out.println("Adding 10? :"+empIds.add(10));
	empIds.add(20);
	empIds.add(30);
	empIds.add(40);
	System.out.println("Adding 10? :"+empIds.add(10));
	System.out.println("HashSet : "+empIds);
	System.out.println("StudIds size : "+empIds.size()); //4
	//HashSet : [20, 40, 10, 30]
	
	
	System.out.println("---------Creating a HashSet from an ArrayList-----------");
	
    HashSet<Integer> numbersSet = new HashSet<Integer>(numbers); 
    System.out.println("Number Set Elements : "+numbersSet);//4
    
    System.out.println("Remove method in Set");
    numbersSet.remove(40);
    System.out.println("Number Set Elements : "+numbersSet);//4
    
    
	
}
}
