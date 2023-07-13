package interfaces;

public class MultipleInheritanceInJava {

}


class A{
	
	void m1() {
		System.out.println("This is m1 from class A");
	}
	
}

class B extends A{
	void m1() {
		System.out.println("This is m1 from class B");
	}
	
}

class C extends A{
	void m1() {
		System.out.println("This is m1 from class C");
	}
	
	
}
/* Multiple Inheritance is not allowed in Java
class D extends B,C{
	
}
*/