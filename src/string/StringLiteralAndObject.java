package string;

public class StringLiteralAndObject {
public static void main(String[] args) {
	
	String name="Salil";// String literal -> String constant Pool
	
	String area = new String("Hyderabad"); // String object //Heap
	
	
	
	String phoneNumber = "7777"; //String literal -> String constant Pool
	
	String studentName = "Salil";// String literal -> String constant Pool
	//if the content is same when creating String literal, java will point it to the same location where an existing string is present
	
	
	
	String country = new String("India"); // Heap
	
	String area2 = new String("Hyderabad"); //Heap
	
}
}
