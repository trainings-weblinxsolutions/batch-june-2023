package string;

public class MethodsInStringPart4 {
public static void main(String[] args) {
	
	
	//trim
	String name = "         Rohit Shetty           ";
	System.out.println(name+"Length of string : "+name.length());
	
	name = name.trim();
	System.out.println(name+",Length of string : "+name.length());
	
	
	String name1 = "         Rohit Shetty           ";
	System.out.println(name1+",Length of string : "+name1.length());
	name1 = name1.replace(" ", "");
	System.out.println(name1+",Length of string : "+name1.length());
	
	
	//valueof
	System.out.println(String.valueOf(15));
	System.out.println(String.valueOf(15.2));
	System.out.println(String.valueOf('a'));
	
	
	//toLowerCase and toUpperCase()
	
	String student1 = "praveen";
	String student2 = "MANISH";
	String student3 = "Pooja";
	String student4 = "kAlYaN";
	
	System.out.println(student1.toUpperCase());
	System.out.println(student2.toLowerCase());
	System.out.println(student3.toUpperCase());
	System.out.println(student4.toLowerCase());

	
	
	//contains
	String content = "Node.js is a back-end JavaScript runtime environment, runs on the V8 JavaScript Engine, and executes JavaScript code outside a web browser.";
	
	//does this string contains the word "outside"
	System.out.println(content.contains("Script1"));
	
}
}
