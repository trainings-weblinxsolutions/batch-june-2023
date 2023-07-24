package string;

public class StringConcatenateOperator {
public static void main(String[] args) {
	
	String firstName = "Rohit";
	String middleName = "K";
	String lastName = "Shetty";
	
	String fullName = firstName + " " + middleName + " " + lastName;
	// fullName : Rohit K Shetty
				  //RohitKShetty
	System.out.println("The full Name of the user is : "+fullName);
	System.out.println("The full Name of the user is :"+firstName + " "+ middleName + " "+lastName);
	
	
	
}
}
