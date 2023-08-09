package collections;

import java.util.ArrayList;

public class CountNoOfOccurrenceOfWords {
public static void main(String[] args) {
	
String sentence = "this is a sentence which has a lot of words, some words from this sentence are repeating and some are not,";

//Count of occurrence of each word in the sentence
System.out.println("Sentence :"+sentence);

String words[] = sentence.replaceAll(",","").split(" ");
System.out.println("Words : "+words.length);

ArrayList<String> uniqueWords = new ArrayList<>();

for(String word:words) {
	
	if(!uniqueWords.contains(word)) {
		uniqueWords.add(word);
	}
}
System.out.println("Unique words :"+uniqueWords);
	
	
}
}
