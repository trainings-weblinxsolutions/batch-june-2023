package access_modifiers;

public class NonSubClass {
public static void main(String[] args) {
	Employee obj = new Employee();
	
	
	//System.out.println(obj.aadharId); // This is not allowed, you cannot access a private variable even in the same package different class
	System.out.println(obj.age);
	System.out.println(obj.id);
	System.out.println(obj.phoneNumber);

}
}
