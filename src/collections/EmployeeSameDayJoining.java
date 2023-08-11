package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class EmployeeSameDayJoining {
public static void main(String[] args) {
	
	
	Emp e1 = new Emp("20/06/2023", "Praveen", 12);
	Emp e2 = new Emp("21/06/2023", "Pooja", 22);
	Emp e3 = new Emp("21/06/2023", "Manish", 32);
	Emp e4 = new Emp("20/06/2023", "Urja", 42);
	Emp e5 = new Emp("22/06/2023", "Priyanka", 52);
	
	
	ArrayList<Emp> employees = new ArrayList<>();
	employees.add(e1);employees.add(e2);employees.add(e3);employees.add(e4);employees.add(e5);
	System.out.println("Employees : "+employees);
	
	
	
	//Map<String, String> employeeDOJ = new HashMap<>();
	
	Map<String, ArrayList<String>> employeeDOJ = new HashMap<>();
	
	
	for(Emp employee : employees) {
		
		String dateOfJoining = employee.dateOfJoining;
		String empName= employee.name;
		ArrayList<String> names = new ArrayList<>();
		if(!employeeDOJ.containsKey(dateOfJoining)) {
			
			names.add(empName);
			employeeDOJ.put(dateOfJoining, names);
		}
		else {
			ArrayList<String> getCurrentNames = employeeDOJ.get(dateOfJoining);
			getCurrentNames.add(empName);
			employeeDOJ.put(dateOfJoining, getCurrentNames);
		}
		
		
		
	}
	System.out.println("Employee DOJ : "+employeeDOJ);
	
	System.out.println("Get all employees that joined on 21/06/2023");
	System.out.println(employeeDOJ.get("21/06/2023"));
	
}
}
class Emp{
	
	String dateOfJoining;
	String name;
	int empId;
	public Emp(String dateOfJoining, String name, int empId) {
		this.dateOfJoining = dateOfJoining;
		this.name = name;
		this.empId = empId;
	}
	@Override
	public String toString() {
		return "Emp [dateOfJoining=" + dateOfJoining + ", name=" + name + ", empId=" + empId + "]";
	}
	
	
	
}