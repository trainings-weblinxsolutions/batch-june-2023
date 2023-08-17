package multithreading;

public class MultithreadingTest {
public static void main(String[] args) throws InterruptedException {
	
    int n = 6; 	
    // Creating and starting n number of threads
    System.out.println("Creating and executing threads");
    for (int i = 0; i < n; i++) {
      Thread obj = new Thread(new Test());
      obj.start();
      
//      Thread.sleep(1000);
    }
    System.out.println("Thread execution done");
	
	
}
}


class Test implements Runnable {

	@Override
	public void run() {
	
		System.out.println("Thread " + Thread.currentThread().getId()+ " is running");
		
	}
	
	
	
}
/*
 * 
Creating and executing threads
Thread 14 is running
Thread 15 is running
Thread 16 is running
Thread 17 is running
Thread 18 is running
Thread execution done
Thread 19 is running

 */

