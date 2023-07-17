package access_modifiers_new;

import access_modifiers.Employee;

public class EmployeeNewSubClass extends Employee {
	
	void m1SubClass() {
		super.m1();
		
			//System.out.println("AadharId : "+aadharId); // This is not allowed, you cannot access a private variable  in the diff package sub class
			//System.out.println("age : "+ // This is not allowed, you cannot access a default variable  in the diff package sub class
			System.out.println("id : "+id);
			System.out.println("phoneNumber : "+phoneNumber);
		}
	
	
	
}
