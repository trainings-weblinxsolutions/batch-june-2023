package collections;

import java.util.ArrayList;

public class ArrayListMethods2 {
public static void main(String[] args) {
	
	ArrayList<Integer> numbers = new ArrayList<>();
	numbers.add(11);
	numbers.add(29);
	numbers.add(13);
	numbers.add(41);
	numbers.add(15);
	
	System.out.println("Numbers rray list : "+numbers);
	
//	for(int i=0;i<numbers.size();i++) {
//		System.out.println(numbers.get(i));
//	}
	
	ArrayList<Integer> studentsAge = new ArrayList<>();
	
//	for(Integer number:numbers) {
//		studentsAge.add(number);
//	}
	//Method - addAll
	studentsAge.addAll(numbers);
	System.out.println("Student Age arraylist : "+studentsAge);
	
	//add new elements to studentsAge
	studentsAge.add(45);
	studentsAge.add(17);
	studentsAge.add(23);
	System.out.println("Student Age arraylist after adding elements : "+studentsAge);
	
	
	//Method - removeAll
	studentsAge.removeAll(numbers);
	System.out.println("Student Age arraylist after removing all numbers : "+studentsAge);
	
	
	//Method - retainAll
	System.out.println("-----Retain ALL --");
	System.out.println("Students Age AL : "+studentsAge);
	System.out.println("Numbers AL : "+numbers);
	studentsAge.add(29);
	studentsAge.add(13);
	System.out.println("Updated Students Age AL : "+studentsAge);
	
	studentsAge.retainAll(numbers);
	System.out.println("After retain ALL, students age AL :"+studentsAge );
	
	//studentsAge.removeAll(numbers);
	//System.out.println("After remove ALL, students age AL :"+studentsAge );
		
	
	
	
	
}
}
