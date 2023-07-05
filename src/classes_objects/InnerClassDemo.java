package classes_objects;

public class InnerClassDemo {
	
	public static void main(String[] args) {
		
		Outer outer_obj = new Outer();
		outer_obj.test();
		
		
	}

}

class Outer {
	int outer_x = 100;

	void test() {
		System.out.println("In test method of Outer class");
		Inner inner_obj = new Inner();
		inner_obj.display();
		System.out.println("Inner X value : "+inner_obj.inner_x);
		 //System.out.println("display: inner_x = " + inner_x); - cannot access this because this is defined in the class Inner and is out of scope for the test method
		
	}
	
	class Inner{
		
		int inner_x=150;
		
	    void display() {
	        System.out.println("display: outer_x = " + outer_x);
	      }

	}
	
	
}
