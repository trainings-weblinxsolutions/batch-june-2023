package interview_questions;

import java.util.HashMap;
import java.util.Map;

public class AnagramsProgram {
	public static void main(String[] args) {
		String input = "I am Lord Voldemort";
		String output = "Tom Marvolo Riddlee";

		input = input.replaceAll(" ", "").toLowerCase();
		output = output.replaceAll(" ", "").toLowerCase();

		Map<Character, Integer> inputMap = getCharacterCount(input);
		Map<Character, Integer> outputMap = getCharacterCount(output);


		System.out.println("inputMap : " + inputMap);
		System.out.println("outputMap : " + outputMap);
		
		if(inputMap.equals(outputMap)) {
			System.out.println("Anagrams");
		}
		else {
			System.out.println("Not Anagrams");
		}

	}

	public static Map<Character,Integer> getCharacterCount(String word) {
		 Map<Character, Integer> wordMap = new HashMap<>();
		for (char c : word.toCharArray()) {

			if (!wordMap.containsKey(c)) {
				wordMap.put(c, 1);
			} else {
				int currCount = wordMap.get(c);
				wordMap.put(c, currCount + 1);
			}

		}
		return wordMap;
	}
}
