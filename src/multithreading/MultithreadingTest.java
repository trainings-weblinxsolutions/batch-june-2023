package multithreading;

public class MultithreadingTest {
	public static void main(String[] args)
	  {
	    int n = 6; 	// Number of threads
	    // Creating and starting n number of threads
	    for (int i = 0; i < n; i++) {
	      Thread obj
	        = new Thread(new Test());
	      obj.start();
	    }
	  }
}
class Test implements Runnable {
	  // run method to execute the thread
	  public void run()
	  {
	    try {
	      // Displaying the running Thread
	      System.out.println(
	        "Thread " + Thread.currentThread().getId()
	        + " is running");
	    }
	    catch (Exception e) {
	      // exception is caught if occurred 
	      System.out.println("Exception has occurred and is caught");
	    }
	  }
	}
