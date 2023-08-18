package multithreading;

import java.util.Scanner;

public class FibonaaciAndPrintNumbers {
public static void main(String[] args) throws InterruptedException {
	 Fibonacci fib = new Fibonacci();
	 fib.start();
     Thread.sleep(4000);
     Reverse rev = new Reverse();
     rev.start();
     Fibonacci fib1 = new Fibonacci();
	 fib1.start();
}
}
class Fibonacci extends Thread
{
     public void run()
     {
          try
          {
               int a=0, b=1, c=0;
               Scanner sc=new Scanner(System.in);
               System.out.print("Enter the Limit for fibonacci: ");

               int n = sc.nextInt();
               System.out.println("\n=================================");
               System.out.println("Fibonacci series:");
               while (n>0)
               {
                    System.out.print(c+" ");
                    a=b;
                    b=c;
                    c=a+b;
                    n=n-1;
//                    if(n == 10) {
//                    	System.out.println("Sleeping for 6 seconds in Fib class");
//                    	Thread.sleep(6000);
//                    }
               }
               sc.close();
          }
          catch (Exception ex)
          {
               ex.printStackTrace();
          }
     }
}

class Reverse extends Thread
{
     public void run()
     {
          try
          {
               System.out.println("\n=================================");
               System.out.println("\nReverse is: ");
               System.out.println("=================================");
               for (int i=10; i >= 1 ;i-- )
               {
                    System.out.print(i+"  ");
                    if(i == 5) {
                    	System.out.println("Sleeping for 10 seconds in Reverse class");
                    	Thread.sleep(10000);
                    }
               }
               System.out.println("\n=================================\n\n");
          }
          catch (Exception ex)
          {
               ex.printStackTrace();
          }
     }
}
