package access_modifiers;

public class TestStudentMarks {
public static void main(String[] args) {
    Student uday = new Student("Uday");
    
    uday.subject1 = 87;
    uday.subject2 = 65;
    uday.subject3 = 93;
    
    uday.setTotal_marks();
    
    //uday.total_marks = 295; --This will give error
    
    System.out.println("Total Marks : "+ (uday.subject1+uday.subject2+uday.subject3));
    
  //  System.out.println("Total Marks : "+ uday.total_marks); - This will give error
    System.out.println("Total marks from the method : "+uday.getTotal_marks());
    
   // uday.print();

}
}
class Student
{
    String name;
    int subject1;
    int subject2;
    int subject3;
    private int total_marks;

    Student(String name)
    {
        this.name = name;
    }

	public int getTotal_marks() {
		return total_marks;
	}

	public void setTotal_marks() {
		this.total_marks = subject1+subject2+subject3;
		print();
	}
	
	private void print() {
		System.out.println("This is in print method");
	}
	
	
	void m1() {
		
	}
    
    


}
