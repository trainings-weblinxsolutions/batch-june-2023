package multithreading;

public class TestThreadSleepDemo {
public static void main(String[] args) {
	
    RunnableTest obj1 = new RunnableTest( "Thread1");
    obj1.start();
    
    RunnableTest obj2 = new RunnableTest( "Thread2");
    obj2.start();
	
}
}

class RunnableTest implements Runnable {

	private Thread t;
	private String threadName;

	// Constructor that sets the name of the thread
	RunnableTest(String name) {
		threadName = name;
		System.out.println("Created " + threadName);
	}

	// Method that is executed when the thread is started
	   public void run() {
	      System.out.println("Currently Running " +  threadName );
	      try {
	         for(int i = 4; i > 0; i--) {
	            System.out.println("Thread is: " + threadName + ", " + i);
	            // Let the thread sleep for a while.
	            	Thread.sleep(1000);
	         }
	      } catch (InterruptedException e) {
	         System.out.println("Thread is " +  threadName + " interrupted.");
	      }
	      System.out.println("Thread is " +  threadName + " exiting!!!");
	   }
	
	 // Method to start the thread
	   public void start () {
	      System.out.println("Starting now " +  threadName );
	      if (t == null) {
	         t = new Thread (this, threadName);
	         t.start ();
	      }
	   }


}