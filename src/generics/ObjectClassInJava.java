package generics;

public class ObjectClassInJava {
public static void main(String[] args) {
	String s1="Java";
	
	Double d1;
	Object obj;
	Test t1 = new Test();
	System.out.println(t1.toString());
	
	obj = s1;
	System.out.println("S1 :"+s1);
	System.out.println("Obj : "+obj);
	
	Integer a1 = 5;
	obj = a1;
	System.out.println("a1 :"+s1);
	System.out.println("Obj : "+obj);
	
}
}


class Test{
	
}