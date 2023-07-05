package classes_objects;

public class StaticVariablesInMethods {

	static int a  =10;
	static int b  =15;
	static int c  =17;
	
	
//	
	{
		System.out.println("Hello from non- static block1");
	}
	
	{
		System.out.println("Hello from non- static block2");
	}
	
	public static void main(String[] args) {
		
		
		System.out.println(a);
		a++;
		System.out.println(a);
		m1();
		
		
		StaticVariablesInMethods obj = new StaticVariablesInMethods(); 
		obj.m2();
		
		
		
		
		
		//m2();
		
		
	}
	
	static void m1() {
		System.out.println("Printing c: "+ c);
	}
	
	 void m2() {
		System.out.println("In method m2()");
	}
	 
	 static {
			System.out.println("Hello! from static block");
			System.out.println("Value of b is : "+b);
		}
	 
	 static {
			System.out.println("Hello! from static block 2");
		}	 

}
