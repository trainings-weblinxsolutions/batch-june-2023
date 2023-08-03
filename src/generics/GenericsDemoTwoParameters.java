package generics;

public class GenericsDemoTwoParameters {
	public static void main(String[] args) {

		
		TwoGenerics<Integer,Integer> obj1 = new TwoGenerics(12, 14);
		obj1.showTypes();
		System.out.println("----------");
		TwoGenerics<Integer,String> obj2 = new TwoGenerics(1, "One");
		obj2.showTypes();
		
		
	}
}

class TwoGenerics<T, V> {
	
	T ob1;
	
	V ob2;
	
	TwoGenerics(T ob1, V ob2)
    {

        this.ob1 =ob1;
    
        this.ob2 =ob2;
    
    }
	T getOb1()
    {
        return ob1;
    }
        
    V getOb2()
    {
        return ob2;
    }
    
    void showTypes()
    {
        System.out.println("Type of T is : " + ob1.getClass().getName());
        System.out.println("Type of V is : " + ob2.getClass().getName());
    }




}