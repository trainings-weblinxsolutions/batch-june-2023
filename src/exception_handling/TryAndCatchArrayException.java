package exception_handling;

public class TryAndCatchArrayException {
public static void main(String[] args) {
	
	int a[] = {5,6,6,9,89};
	System.out.println("Start of program");
	try {
		System.out.println("Before");
		System.out.println(a[8]);
		System.out.println("After");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		//e.printStackTrace();
		System.out.println("Index not in range, please try to print an index in range");
	}
	System.out.println("End of program");

	
}
}
