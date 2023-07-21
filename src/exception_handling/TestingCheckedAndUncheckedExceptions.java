package exception_handling;

public class TestingCheckedAndUncheckedExceptions {
	
	public static void main(String[] args) {
		
	}
	
	static void callingMethod1() {
		
		A obj = new A();
		
		try {
			obj.method1();
		} catch (CheckedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	static void callingMethod2() {
		
		A obj = new A();
		
		obj.method2();
		
	}

}


class CheckedException extends Exception
{
}

class UncheckedException extends RuntimeException
{
}


class A
{
    void method1() throws CheckedException
    {
    	System.out.println("Throws a checked exception");
    	throw new CheckedException();
    	
    }

    void method2() throws UncheckedException
    
    {
    	
    	System.out.println("Throws a unchecked exception");
    	throw new UncheckedException();
    	
    	
    }
}
