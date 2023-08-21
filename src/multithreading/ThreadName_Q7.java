package multithreading;

public class ThreadName_Q7 extends Thread  {
	public static void main(String [] args) 
    {
		ThreadName_Q7 t = new ThreadName_Q7(); /* Line 5 */
        t.run();  /* Line 6 */
		t.start();
        
    }

    public void run1() 
    {
        for(int i=1; i < 3; ++i) 
        {
            System.out.print(i + "..");
        }
    }
}
