package inheritance;

public class MethodOverriding {
public static void main(String[] args) {
	
	System.out.println("----------------------------");
//    A a = new A();
//    a.print();
//    System.out.println("----------------------------");
    B b = new B();
    b.print();
//    System.out.println("----------------------------");
//    C c = new C();
//    c.print();
//    System.out.println("----------------------------");
//    D d = new D();
//    d.print();
//    System.out.println("----------------------------");
//    E e = new E();
//    e.print();
//    System.out.println("----------------------------");    


	
	
	
	
}
}
class A
{
    void print()
    {
        System.out.println("In class A");
    }
    
    static void m1() {
    	System.out.println("From class A m1 method");
    }
    static {
    	System.out.println("This is a static block in class A");
    }
}

class B extends A
{
    void print()
    {
    	super.print();
        System.out.println("In class B");
        m1();
    }
    static void m1() {
    	
    	System.out.println("From class B m1 method");
    }
    static {
    	System.out.println("This is a static block in class B");
    }
}

class C extends B
{
    void print()
    {
    	super.print();
        System.out.println("In class C");
    }
}

class D extends A
{
    void print()
    {
        System.out.println("In class D, printing before super class A");
        super.print();
        
    }
}

class E extends A
{
    void print()
    {
        System.out.println("In class E, not calling the super class method at all.");
    }
}

