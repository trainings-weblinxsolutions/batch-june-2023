package multithreading;

public class ThreadName extends Thread  {
	public void run() 
    { 
        for(int i = 0; i < 3; i++) 
        { 
            System.out.println("C"); 
            System.out.println("D"); 
        } 
    } 
	
	public static void main(String args[]) 
    { 
    ThreadTest1 t1 = new ThreadTest1(); 
    ThreadName t2 = new ThreadName(); 
    t1.start(); 
    t2.start(); 
} 
	
	
}
class ThreadTest1 extends Thread
{ 
    public void run() 
    { 
        for(int i = 0; i < 3; i++) 
        { 
            System.out.println("A"); 
            System.out.println("B"); 
        } 
    } 
} 