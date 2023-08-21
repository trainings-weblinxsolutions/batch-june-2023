package interview_questions;

import java.util.Arrays;

public class AnagramProgram2 {
public static void main(String[] args) {
	String input = "I am Lord Voldemort";
	String output = "Tom Marvolo Riddle";

	input = input.replaceAll(" ", "").toLowerCase();
	output = output.replaceAll(" ", "").toLowerCase();
	
	
	char inputArray[] = input.toCharArray();
	char outputArray[] = output.toCharArray();
	
	System.out.println(inputArray);
	System.out.println(outputArray);
	System.out.println("----Sorting----");
	
	Arrays.sort(inputArray);
	Arrays.sort(outputArray);
	System.out.println(inputArray);
	System.out.println(outputArray);
	
	if(Arrays.equals(inputArray, outputArray)) {
		System.out.println("Anagrams");
	}
	else {
		System.out.println("Not Anagrams");
	}
	
	
}
}
