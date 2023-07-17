package access_modifiers;

public class EmployeeSubClass extends Employee {
	
	
	void m1SubClass() {
		
	//	System.out.println("AadharId : "+aadharId); // This is not allowed, you cannot access a private variable even in the same package sub class
		System.out.println("age : "+age);
		System.out.println("id : "+id);
		System.out.println("phoneNumber : "+phoneNumber);
	}
}
