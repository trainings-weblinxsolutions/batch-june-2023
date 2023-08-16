package directories;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerializableRead {
public static void main(String[] args) throws IOException, ClassNotFoundException {
	
	FileInputStream fileInputStream = new FileInputStream(
			"/Users/sabniss/Desktop/java-training/batch-june-2023/src/directories/serialization.txt");
	
	
	ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
	
	Student retreiveStudent = (Student) objectInputStream.readObject();
	
	objectInputStream.close();
	
	System.out.println(retreiveStudent.name);
	System.out.println(retreiveStudent.section);
	System.out.println(retreiveStudent.rollNumber);

	
	
}
}
