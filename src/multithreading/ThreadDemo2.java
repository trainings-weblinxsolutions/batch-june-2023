package multithreading;

public class ThreadDemo2 extends Thread {

    public static void main(String [] args) 
    {
        ThreadDemo2 t = new ThreadDemo2();
        t.start();
        System.out.print("one. ");
        t.start();
        System.out.print("two. ");
    }
    public void run() 
    {
        System.out.print("Thread ");
    }

}
