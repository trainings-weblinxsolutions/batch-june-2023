package string;

public class IndexOfLatsIndexOf {
public static void main(String[] args) {
	
	String sentence = "This is a good example of text";
	
	System.out.println(sentence.indexOf('e'));//15
	System.out.println(sentence.indexOf('e', 16));//21
	
	System.out.println(sentence.indexOf("oo"));//11
	System.out.println(sentence.indexOf('z'));//-1
	
	
	System.out.println(sentence.lastIndexOf('e'));
	System.out.println(sentence.lastIndexOf('z'));//-1
	
	
	
}
}
