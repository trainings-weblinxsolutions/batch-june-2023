package collections;

import java.util.ArrayList;

public class ArrayListStudentDemo {
public static void main(String[] args) {
	
	//a
	Student std1 = new Student("Praveen", 23, 10, 90);
	Student std2 = new Student("Pooja", 22, 20, 99);
	Student std3 = new Student("Priyanka", 21, 30, 82);
	Student std4 = new Student("Manish", 20, 40, 91);
	Student std5 = new Student("Prudhvi", 24, 50, 87);
	

	//b
	ArrayList<Student> students = new ArrayList<>();
	students.add(std1);
	students.add(std2);
	students.add(std3);
	students.add(std4);
	students.add(std5);
	
	
	//c&d
	Student maxMarksStudent=students.get(0);
	Student maxAgeStudent=students.get(0);
	for(Student student:students) {
		
		if(student.marks > maxMarksStudent.marks) {
			maxMarksStudent = student;
		}
		if(student.age > maxAgeStudent.age) {
			maxAgeStudent = student;
		}
	}
	System.out.println("Max marks student : "+maxMarksStudent);
	System.out.println("Max age student : "+maxAgeStudent);
	
	/*
			Max marks student : Student [name=Pooja, age=22, id=20, marks=99]
			Max age student : Student [name=Prudhvi, age=24, id=50, marks=87]
*/
	

	
}
}
 

class Student{
	
	String name;
	int age;
	int id;
	int marks;
	public Student(String name, int age, int id, int marks) {
		this.name = name;
		this.age = age;
		this.id = id;
		this.marks = marks;
	}
	
	
	//toString method of the object
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", id=" + id + ", marks=" + marks + "]";
	}
	
	
	
}