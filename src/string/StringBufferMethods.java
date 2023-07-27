package string;

public class StringBufferMethods {
public static void main(String[] args) {
    
	
	//setLength
	StringBuffer text = new StringBuffer("Java Programming");
    System.out.println("Text : "+text);
    System.out.println("Length of text : "+text.length());//16
    
    text.setLength(20);
    System.out.println("Length of text : "+text.length());//
    System.out.println("Text : "+text);
    
    System.out.println("Char At:"+text.charAt(2));
    
    //delete and deleteCharAt
    StringBuffer firstWord = new StringBuffer("Moring");
    System.out.println(firstWord);
    firstWord.delete(1, 4);
    System.out.println(firstWord);
    firstWord.deleteCharAt(0);
    System.out.println(firstWord);    

    //substring()
    StringBuffer name = new StringBuffer("Wednesday");
    String firstPart = name.substring(0, 5);
    String secondPart = name.substring(5);
    System.out.println(firstPart);
    System.out.println(secondPart);
    String thirdPart = name.substring(0, 10); 


    
    
}
}
