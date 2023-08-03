package generics;

public class SampleGenericsDemo {
public static void main(String[] args) {
	//SampleGenerics<Integer> obj1 = new SampleGenerics(12);	
	
	SampleGenerics<Integer> obj1 = new SampleGenerics<Integer>(12);
    obj1.showType();
    
    System.out.println(obj1.getObject());
    
    Integer num = obj1.getObject();
    System.out.println("Num is : "+num);
    
    SampleGenerics<String> obj2 = new SampleGenerics("salil");
    obj2.showType();
    String name = obj2.getObject();
    System.out.println("Name is : "+name);
    
    
    
    //SampleGenerics<Integer> obj3 = new SampleGenerics<Integer>("12");
    
    SampleGenerics<Integer> obj4 = new SampleGenerics(120);
    System.out.println(obj4.getObject());
    Integer num4 = obj4.getObject();
    System.out.println("Num4 : "+num4);
    
    
    
    SampleGenerics<Double> obj5 = new SampleGenerics(12.50);
    SampleGenerics<Character> obj6 = new SampleGenerics('C');
    
   
	
}
}

class SampleGenerics<T>{
	
    T value; //Integer value;
    
    SampleGenerics(T object) // SampleGenerics(Integer object)
    {
        this.value = object;
    }
    public T getObject() {  // public Integer getObject() {
        
        return value;
    }
        
    void showType()
    {
        System.out.println("Type of T is : " + value.getClass().getName());
    }

	
	
}