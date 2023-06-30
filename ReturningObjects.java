class ReturningObjects {
  public static void main(String args[]) {
   
       Test ob1 = new Test(2);
       System.out.println("Obj1 : "+ " a : "+ob1.a); //2
    
	   Test ob2 = ob1.incrByTen();
       System.out.println("Obj2 : "+ " a : "+ob2.a);//12
       
	   Test ob3 = ob2.incrByTen();       	   
       System.out.println("Obj3 : "+ " a : "+ob3.a);//22   



}

}


class Test {
int a;

Test(int i) {
a = i;
}

Test incrByTen() {
    Test temp = new Test(a+10);
    return temp;
}

}
