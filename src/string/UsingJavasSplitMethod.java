package string;

public class UsingJavasSplitMethod {
public static void main(String[] args) {
	
	
	String sentence = "Today is a bright sunny day";
	System.out.println("Length of sentence : "+sentence.length());
	
	String words[] = sentence.split(" ");
	System.out.println("Length of words array : "+words.length);
	
//	for(int i=0;i<words.length;i++) {
//		
//		System.out.println("Word : "+words[i] + " ,Length is : "+words[i].length());
//	}
	
	//foreach
	for(String xyz:words) {
		System.out.println("Word : "+xyz + " ,Length is : "+xyz.length());
	}
}
}
