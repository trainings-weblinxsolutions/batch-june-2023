package inheritance;

public class UsingFinalAtAClassLevel {
public static void main(String[] args) {
	
	
	String s="Salil";
	
	
	
}
}


final class College{
	
	void m1() {
		System.out.println("In m1 of college class");
	}
	
}

//This will give error because we cannot extend a final class
//class Library extends College{
//	
//	
//}