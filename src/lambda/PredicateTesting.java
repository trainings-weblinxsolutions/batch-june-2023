package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class PredicateTesting {
public static void main(String[] args) {
	
	Predicate<Integer> isDivisibleByTwo = (value) -> value % 2 == 0;
	System.out.println(isDivisibleByTwo.test(6));
	
	Predicate<Integer> isDivisibleByFive = (value) -> value % 5 == 0;
	System.out.println(isDivisibleByFive.test(20));
	
	//combine predicates --and predicate
	System.out.println("------ And Predicate---");
	Predicate<Integer> isDivisibleByTwoAndFive = isDivisibleByTwo.and(isDivisibleByFive);
	System.out.println(isDivisibleByTwoAndFive.test(12)); // false
	System.out.println(isDivisibleByTwoAndFive.test(25)); // false
	System.out.println(isDivisibleByTwoAndFive.test(30));//  true
	
	// Or Predicate - Try this out
	// Negate  -  Try this out
	
	System.out.println("---IsEqual---");
	System.out.println(Predicate.isEqual("Stark").test("Stark"));
	
	System.out.println("----Passing a class object----");
	Predicate<Student> isEligible = stud -> stud.id >=15;
	Student s1 = new Student();
	s1.id=12;s1.name="Rohit";
	System.out.println(isEligible.test(s1));
	
	System.out.println("----Checking a collection----");
	List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
	Predicate<List<Integer>> isSize = studIds -> studIds.contains(40);
	System.out.println(isSize.test(numbers));
	
	
	
}
}

class Student{
	
	int id;
	String name;
}
