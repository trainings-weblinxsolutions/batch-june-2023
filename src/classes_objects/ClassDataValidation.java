package classes_objects;

public class ClassDataValidation {
public static void main(String[] args) {
	
	Student s1 = new Student("Praveen");
	Student s2 = new Student("Manish");
	
	
	s1.marks=87;
	s1.section='A';
	System.out.println("S1 marks : "+s1.marks + " section : "+s1.section);
	
	//s1.marks = 167;
	//s1.section='Z';
	
	//s1.setMarks(167);
	//s1.setSection('Z');
	
	s1.setDetails(90, 'Z');
	
	System.out.println("S1 marks : "+s1.marks + " section : "+s1.section);
	
	
	
	
}
}
class Student{
	
	String name;
    int marks;
    char section;
	
    public Student(String name) {
		this.name = name;
	}
    
    void setMarks(int marks)
    {
        if( marks >= 0 && marks <= 100 )
        {
            this.marks = marks;
        }
    }


    void setSection(char section)
    {
        if( section == 'A' || section == 'B' || section == 'C' || section == 'D')
        {
            this.section = section;
        }
    }
    
    void setDetails(int marks, char section)
    {
        setMarks(marks);
        setSection(section);
    }


    
    

}