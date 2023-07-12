package abstract_classes;

public class RulesWhenUsingAbstractClassesAndMethods {

}


//1.Valid, even with out any abstract methods
abstract class A
{
// Valid, even with out any abstract methods
}

/* //2. Invalid, class B should be abstract, since it has abstract method.
class B{
    abstract void method1();
}
*/


//3.An abstract class can have one or more abstract methods.
abstract class C
{
    abstract void method1();

    abstract double method2(int x, int y);

    abstract boolean method3(char z);
}

//4.An abstract class can have both abstract and non abstract (or concrete) method.
abstract class D
{
    void method1()
    {
        System.out.println("I am a concrete method");
    }

    abstract double method2(int x, int y);

    int method3(double z)
    {
        System.out.println("I am also a concrete method");
return 0;
    }

    abstract boolean method4(char z);
}

/*5.The abstract method should not have method body. Even empty flower braces { } are not allowed.
abstract class E
{
    abstract void method1(); // Valid

    abstract void method2() {} // Invalid - since it has method body

}
*/






abstract class E
{
    abstract void method1();

    abstract void method2();

}

//// Invalid since F does not implement the abstract methods from class E
//class F extends E{
//}

abstract class G extends E
{
    // Valid since G is marked as abstract, even though the abstract methods are not implemented,
}

/*
class H extends E
{
    void method1()
    {
        System.out.println("Method1 implemented here.");
    }
   

    // Invalid, class H should be marked as abstract, since method2 is not implemented.
}
*/







abstract class X
{
    abstract void method1();
    abstract void method2();
}

abstract class Y extends X
{
    void method1()
    {
        System.out.println("Method1 implemented here.");
    }
}

abstract class Z extends Y{	
	 abstract void method3();
}

class W extends Z{

	@Override
	void method2() {
		// TODO Auto-generated method stub
		
	}	
	void method3() {
		// TODO Auto-generated method stub
		
	}	
}

