package multithreading;

import java.util.Scanner;

public class FibonaaciAndPrintNumbersWithoutThread {
public static void main(String[] args) {
	
	FibonacciWot fib = new FibonacciWot();
	fib.run();
	
	
	
    ReverseWoT rev = new ReverseWoT();
    rev.run();
	
	
	
}
}
class FibonacciWot
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
               }
               sc.close();
          }
          catch (Exception ex)
          {
               ex.printStackTrace();
          }
     }
}

class ReverseWoT
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
               }
               System.out.println("\n=================================\n\n");
          }
          catch (Exception ex)
          {
               ex.printStackTrace();
          }
     }
}

