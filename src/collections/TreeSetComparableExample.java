package collections;

import java.util.TreeSet;

public class TreeSetComparableExample {
public static void main(String[] args) {
	Employee1 e1 = new Employee1(27, "Abhishek");
	Employee1 e2 = new Employee1(13, "Sumit");
	Employee1 e3 = new Employee1(48, "Dinesh");
	Employee1 e4 = new Employee1(17, "Abhishek");
	Employee1 e5 = new Employee1(10, "Abhishek");
	Employee1 e6 = new Employee1(33, "Dinesh");
	Employee1 e7 = new Employee1(15, "Dinesh"); 
	TreeSet<Employee1> employeesTS = new TreeSet<>();
	employeesTS.add(e1);
	employeesTS.add(e2);
	employeesTS.add(e3);
	employeesTS.add(e4);
	employeesTS.add(e5);
	employeesTS.add(e6);
	employeesTS.add(e7);
	System.out.println("Employees TS: "+employeesTS);
}
}
class Employee1 implements Comparable<Employee1>{
	int empId;
	String name;
	public Employee1(int empId, String name) {
		this.empId = empId;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee1 [empId=" + empId + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Employee1 o) {
	//return empId - o.empId;
		return name.compareTo(o.name);
		
		//Hint: Sort on name first and if names are equal sort on emp ids
		
		//Abhishek - 27,17,10
		//Dinesh   - 48,33,15
		//Sumit    - 13
		
	}
	
	
	
}