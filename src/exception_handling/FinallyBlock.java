package exception_handling;

public class FinallyBlock {
public static void main(String[] args) {
	
	int a  = 10;
	int b  = 0;
	
	try {
		System.out.println("a/b :: "+ a/b);
		// You are trying to connect to a database 
		// open connection
		// executing query - exception
	}
	catch (Exception e) {
		// TODO: handle exception
		System.out.println("In catch block");
		
	}
	finally {
		System.out.println("In finally block");
		//close the connection to the database
	}
	
	
	
	
	
}
}
