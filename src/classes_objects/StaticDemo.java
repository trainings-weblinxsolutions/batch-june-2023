package classes_objects;

public class StaticDemo {
	
	public static void main(String[] args) {
		
		Emp e1 = new Emp(12,28);
		Emp e2 = new Emp(10,32);
		
		Emp e3 = new Emp(16,32);
		Emp e4 = new Emp(21,29);
		
		System.out.println("E1 : Emp id "+ e1.employeeId + " Emp Age :"+e1.empAge);
		System.out.println("E2 : Emp id "+ e2.employeeId + " Emp Age :"+e2.empAge);
		
		//e1.count=5;
		
		//System.out.println("E1 count : "+e1.count); 
		//System.out.println("E2 count : "+e2.count);
		
		
		System.out.println("COunt value : "+Emp.count);
	//	System.out.println("COunt value : "+Emp.employeeId);
		
		
		
	}

}


class Emp{
	int employeeId;
	int empAge;
	
	static int count = 0;
	
	
	public Emp(int employeeId, int empAge) {
		this.employeeId = employeeId;
		this.empAge = empAge;
		count++;
	}
	
	
	
	
}
