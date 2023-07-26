package string;

public class MethodsInStringPart3 {
public static void main(String[] args) {
	
	//Substring
	String s1 = "Welcome to a morning class ";
	String s2 = s1.substring(11);  
	System.out.println("Substring : "+s2);
	
	//String s3 = s1.substring(50);   //StringIndexOutOfBoundsException
	//System.out.println("Substring : "+s3);
	
	
	String partOfAString = s1.substring(0, 5);
	System.out.println("Part of  a string : "+partOfAString);
	
	
	//Replace //replace ALL
	String word = "Wrlvomr";
	String replacedWord = word.replace('v', 'c'); 
	System.out.println("Word : "+word+ " ,Replaced word : "+replacedWord);
	
	String replacedWord2 = word.replace('r', 'e');
	System.out.println("Word : "+word+ " ,Replaced word : "+replacedWord2);
	
	
	String sentence = "Moon is bright"; //Sun is bright
	String sentenceReplace = sentence.replace('i', 't');
	 sentenceReplace = sentenceReplace.replace('s', 'o');
	 System.out.println("Sentence : "+sentence + " Repalce senetence : "+sentenceReplace);
	 
	 String sentenceReplace2 = sentence.replace("is", "to");
	 System.out.println("Sentence : "+sentence +" Replaced sentence : "+sentenceReplace2);
	 
	 
	 String verse = "To be or not to be"; //replace be with we
	 String replacedVerse = verse.replace("be", "we");
	 System.out.println("Replaced Verse : "+replacedVerse);

}
}
