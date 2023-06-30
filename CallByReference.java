class CallByReference {
  public static void main(String args[]) {
    Test ob = new Test(15, 20);
    System.out.println("ob.a and ob.b before call: " +ob.a + " " + ob.b);
	ob.meth(ob);
   System.out.println("ob.a and ob.b after call: " + ob.a + " " + ob.b);

    

}

}


class Test {
  int a, b;
  Test(int i, int j) {
    a = i;
	b = j; 	
	}
  // pass an object
  void meth(Test o) {
	a *= 2;
	b /= 2; 
}
}
