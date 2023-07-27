package string;

public class StringBufferReverse {
public static void main(String[] args) {
	
	
	String name = "java";
	//reverse - avaj
	System.out.println("Orignal string : "+name);
	String reverse="";
	
	for(int i =0;i<name.length();i++) {
		reverse = name.charAt(i)+reverse;
		
	}
	System.out.println("Reversed String : "+reverse);
	
	
	
	StringBuffer text = new StringBuffer("hello");
	System.out.println("Reversed string : "+text.reverse());
	
	
}
}
