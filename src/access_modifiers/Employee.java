package access_modifiers;

public class Employee {
	
	private 	int aadharId;
				int age;
	protected 	int id;
	public 		int phoneNumber;
	
	
public	void m1() {
		System.out.println("AadharId : "+aadharId);
		System.out.println("age : "+age);
		System.out.println("id : "+id);
		System.out.println("phoneNumber : "+phoneNumber);
		
		age=10;
		id=9;
		aadharId = 164763;
		phoneNumber = 8748849;
	}
	
	
}
