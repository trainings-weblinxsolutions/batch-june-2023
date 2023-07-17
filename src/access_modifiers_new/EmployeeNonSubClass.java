package access_modifiers_new;

import access_modifiers.Employee;

public class EmployeeNonSubClass {
public static void main(String[] args) {
	Employee obj = new Employee();
	
		//System.out.println(obj.aadharId); // This is not allowed, you cannot access a private variable  in the diff package different class
		//System.out.println(obj.age); // This is not allowed, you cannot access a default variable  in the diff package different class
		//System.out.println(obj.id);// This is not allowed, you cannot access a protected variable  in the diff package different class
		System.out.println(obj.phoneNumber);
}
}
