package collections;

import java.util.HashSet;
import java.util.TreeSet;

public class EmployeeDemoUsingSet {
public static void main(String[] args) {
	Employee e1 = new Employee(10, "Abhishek");
	Employee e2 = new Employee(13, "Sumit");
	Employee e3 = new Employee(15, "Dinesh");
	
	System.out.println("-----HashSet-----");
	HashSet<Employee> employees = new HashSet<>();
	employees.add(e1);
	employees.add(e2);
	employees.add(e3);
	System.out.println("Employees : "+employees);
	
//	System.out.println("-----TreeSet-----");
	//This will give error as Java doesn't understand how to sort the different objects
//	TreeSet<Employee> employeesTS = new TreeSet<>();
//	employeesTS.add(e1);
//	employeesTS.add(e2);
//	employeesTS.add(e3);
//	System.out.println("Employees TS: "+employeesTS);
//	
	
}
}
class Employee{
	int empId;
	String name;
	public Employee(int empId, String name) {
		this.empId = empId;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + "]";
	}
	
	
	
}