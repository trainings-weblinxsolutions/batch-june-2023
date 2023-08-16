package directories;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializableTest {
	public static void main(String[] args) throws IOException {
		Student student1 = new Student();
		student1.name = "Prakash";
		student1.rollNumber = 25;
		student1.section = 'C';
		
		System.out.println(student1.rollNumber);

		FileOutputStream fileOutputStream = new FileOutputStream(
				"/Users/sabniss/Desktop/java-training/batch-june-2023/src/directories/serialization.txt");
		
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(student1);
		
		objectOutputStream.flush();
		objectOutputStream.close();
		System.out.println("Data writtent to file in a serialized format");

		
		

	}
}

class Student implements Serializable {

	String name = "";
	static int rollNumber;
	char section = 'A'; // LINE C
}
