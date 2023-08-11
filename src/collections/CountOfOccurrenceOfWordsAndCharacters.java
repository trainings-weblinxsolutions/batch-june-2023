package collections;

import java.util.HashMap;
import java.util.Map;

public class CountOfOccurrenceOfWordsAndCharacters {
public static void main(String[] args) {
	
	String input = "This this is is done by Java Java is this";
	
	//Q1
	String words[] = input.split(" ");
	System.out.println("A1  : "+words.length);
	
	//Q2 - count of each word
	Map<String, Integer> wordCount = new HashMap<>();
	
	for(String word:words) {
		
		if(!wordCount.containsKey(word)) {
			wordCount.put(word, 1);
		}
		else {
			int countOfWord = wordCount.get(word);
		// int countOfWord  = wordCount.get("is");
		// int countOfWord	= 2;
			wordCount.put(word, countOfWord+1);
		//  wordCount.put("is", 2+1);
		//  wordCount.put("is", 3);			
		}
		
	}
	
	System.out.println("Word Count : "+wordCount);
	
	
	//Q3 - count of each character
	Map<Character, Integer> characterCount = new HashMap<>();
	for(String word:words) {
		
		
		//for(char letter : word.toCharArray()) {
		for(int i=0;i<word.length();i++) {
			
			char letter = word.charAt(i);
			if(!characterCount.containsKey(letter)) {
				characterCount.put(letter, 1);
			}
			else {
				int countOfChar = characterCount.get(letter);
				characterCount.put(letter, countOfChar+1);
			}
		}
		
		
	}
	System.out.println("Character count  :"+characterCount);
	
	
	
}

}
