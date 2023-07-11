package inheritance;
public class OverridingMethodsInheritance {
public static void main(String[] args) {
	ChildClass obj = new ChildClass();
	obj.m1();
	//From m1() of class ParentClass
	ChildClass2 obj2 = new ChildClass2();
	obj2.m1();
}
}
class ParentClass{
	final void m1() {
		System.out.println("From m1() of class ParentClass");
	}
}
class ChildClass extends ParentClass{
	void m2() {
		System.out.println("From m2() of class ChildClass");
	}
	// we cannot override the method m1 because it is marked as final
//	void m1() {
//		System.out.println("From m1() of class ChildClass");
//	}
}
class ChildClass2 extends ParentClass{
	
	
}