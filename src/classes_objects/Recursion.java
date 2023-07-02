package classes_objects;
class Recursion {
  public static void main(String args[]) {
   
      Factorial f = new Factorial();
      System.out.println("Factorial of 4 is " + f.fact(4));
      System.out.println("Factorial of 4 is " + f.fact(10));      

}

}


class Factorial {
       // this is a recursive method
	int fact(int n) {
	//System.out.println("Coming here");
	
		 int result;
         if(n==1) return 1;
         result = fact(n-1) * n;
//	System.out.println("Before return");         
         return result;
         
    } 
}
