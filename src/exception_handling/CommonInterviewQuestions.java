package exception_handling;

public class CommonInterviewQuestions {
public static void main(String[] args) {
	
	
	/*Q5
	try
    {
        int[] a = {1, 2, 3, 4};
         
        int i = a[4];
    }
    catch (NumberFormatException e) 
    {
        System.out.println(1);
    }
    catch (NullPointerException e) 
    {
        System.out.println(2);
    }
    catch (ArrayIndexOutOfBoundsException e) 
    {
        System.out.println(3);
    }
    */
	
	
	/* Q3
		try {
	       // Some monitored code
	       throw new Derived();
	    }
		
	    catch(Base b)     { 
	       System.out.println("Caught base class exception"); 
	    }
		 catch(Derived d)  { 
		       System.out.println("Caught derived class exception"); 
		    }
	   
	*/
	
	
	
	/* Q2
	  int x = 0;
      int y = 10;
      int z = y/x;
      */
	
	/* Q1
    try {
       throw new Test();
    }
    catch(Test t) {
       System.out.println("Got the Test Exception");
    }
    finally {
       System.out.println("Inside finally block ");
    }
    */

}
}
class Test extends Exception { }

class Base extends Exception {} //parent class
class Derived extends Base  {}//child class