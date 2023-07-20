package exception_handling;

public class MultipleTryBlocks {
public static void main(String[] args) {
	
	
	int a  = 10;
	
	int b  = 2;
	
	
	try {
		
		System.out.println(a/b);
		
		try {
			System.out.println(a+b);
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}
	catch (Exception e) {
		try {
			
		}
		catch (Exception e1) {
			// TODO: handle exception
		}
	}
	
	
	
}
}
