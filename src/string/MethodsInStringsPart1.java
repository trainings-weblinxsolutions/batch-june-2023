package string;

public class MethodsInStringsPart1 {
public static void main(String[] args) {
	//length
	//charAt(parameter)
	
	//length method in string class
	String name = "Rohit Shetty";
	System.out.println("Length of string is :"+name.length());
	int len = name.length();
	System.out.println("Len of string is:"+len);
	
	System.out.println("Length of the string, "+name + " is : "+name.length());
	
	
	//charAt(parameter)
	
	for(int i=0;i<name.length();i++) {
		System.out.println(name.charAt(i));
		
	}
	
	
	//concat
	
	String name1 = "Rohit";
	name1 = name1.concat(" Shetty");
	System.out.println("Name using concat : "+name1);
			
}
}
