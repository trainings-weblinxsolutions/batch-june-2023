package string;

public class StringBufferExample {
public static void main(String[] args) {
	
	//  To create an empty StringBuffer with a default initial capacity of 16 characters
	StringBuffer sb = new StringBuffer();
	System.out.println("Length of StringBuffer is :"+sb.length());
	System.out.println("Capacity of StringBuffer is :"+sb.capacity());
	
	
	
	//  To create a StringBuffer from a String
	//StringBuffer text = new StringBuffer("Happy new year"); or
	String word ="Happy new year";
	StringBuffer text = new StringBuffer(word);
	System.out.println("Text : "+text);
	System.out.println("Length of StringBuffer is :"+text.length());
	System.out.println("Capacity of StringBuffer is :"+text.capacity());


	// To create an empty StringBuffer with an initial capacity of 100 characters
	StringBuffer sb1 = new StringBuffer(10);
	System.out.println("Capacity of sb1 : "+sb1.capacity());
	
	
	//creating String buffer using a char sequence
    CharSequence cs = "ABC"; // LINE A
    StringBuffer sb2 = new StringBuffer(cs);
    
    
    
   


	
	
}
}
