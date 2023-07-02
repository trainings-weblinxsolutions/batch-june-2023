package classes_objects;
class ReturningObjects {
  public static void main(String args[]) {
   
       Test2 ob1 = new Test2(2);
       System.out.println("Obj1 : "+ " a : "+ob1.a); //2
    
	   Test2 ob2 = ob1.incrByTen();
       System.out.println("Obj2 : "+ " a : "+ob2.a);//12
       
	   Test2 ob3 = ob2.incrByTen();       	   
       System.out.println("Obj3 : "+ " a : "+ob3.a);//22   



}

}


class Test2 {
int a;

Test2(int i) {
a = i;
}

Test2 incrByTen() {
    Test2 temp = new Test2(a+10);
    return temp;
}

}
