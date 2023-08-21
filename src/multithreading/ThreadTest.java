package multithreading;

class MyThread extends Thread  
{ 
  public void run()  
   {         
       System.out.println("Running");   
   } 
} 
class ThreadTest {
   public static void main(String args[]) throws InterruptedException  
        {         
             Runnable r = new MyThread(); // #1         
               Thread myThread = new Thread(r); // #2         
               myThread.start();     
       } 
}