class PassObj {
  public static void main(String args[]) {
    Test ob1 = new Test(100, 22,15);
    
    System.out.println("Obj1 : "+ " a : "+ob1.a + " b : "+ob1.b);
    
    Test ob2 = new Test(100, 22,25);
    
    System.out.println(ob1.equals(ob2));

    

}

}


class Test {

int a, b,c;

Test(int i, int j,int k) {
    a = i;
	b = j; 
	c = k;
}
   
       // return true if o is equal to the invoking object
        boolean equals(Test o) {
         if(o.a == a && o.b == b) return true;
          else return false;
        }
}
