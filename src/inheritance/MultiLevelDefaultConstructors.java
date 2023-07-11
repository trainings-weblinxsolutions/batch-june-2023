package inheritance;

public class MultiLevelDefaultConstructors {
public static void main(String[] args) {
	
	//A1 objA = new A1();
	
	//B1 objB = new B1();
	
//	C1 objC = new C1();
	
	B1 objB = new B1(5);
	System.out.println(objB.number);
	
}
}



class A1
{
	
	int number;
	
//    A1()    // LINE A
//    {
//        System.out.println("Created A1");
//        
//    }
    
    A1(int number){
    	 System.out.println("from Created A1 parameterized");
    	this.number = number;
    }
    
    
}
class B1 extends A1
{
//    B1()
//    {
//        System.out.println("Created B1");
//    }
//    
    B1(int number){
    	super(number);
    	this.number = number;
    }
}
//class C1 extends B1
//{
//    C1()
//    {
//        System.out.println("Created C1");
//    }
//}
