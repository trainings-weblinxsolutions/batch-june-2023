package generics;

public class SampleNonGenericDemo {
public static void main(String[] args) {
	
	SampleNonGeneric integerObject = new SampleNonGeneric(12);
    integerObject.displayType();
    
    System.out.println(integerObject.getObj());
    
    Integer num = (Integer)integerObject.getObj();
    System.out.println("Num is :"+num);
    
    
    SampleNonGeneric stringObject = new SampleNonGeneric("Salil");
    stringObject.displayType();
    
    String  lastName = "S";
    
    String firstName = (String)stringObject.getObj();
    System.out.println("First Name : "+firstName);
    
	String fullName = stringObject.getObj() + lastName;
					//Salil S
	System.out.println("Full Name is : "+fullName);
}
}
class SampleNonGeneric
{ 
    Object value;
        
    public SampleNonGeneric(Object obj)
     {       
        this.value = obj;
     }
       
    Object getObj()
    {
        return value;
    }
        
    void displayType()
    {
        System.out.println("The type of object is : "+value.getClass().getName());
    }
}
