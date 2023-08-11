package directories;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamDemo {
	public static void main(String[] args) throws IOException {

		File file = new File(
				"/Users/sabniss/Desktop/java-training/batch-june-2023/src/abstract_classes/CalculateAreas.java");

		
		InputStream is = null;

		System.out.println("File Exists ?: " + file.exists());

		if (file.exists()) // LINE C
		{
			//////
			is = new FileInputStream(file);
			

			// LINE D
			int i = 0;

			// LINE E
			while ((i = is.read()) != -1) {
				System.out.print((char) i); // LINE F
			}
			
			is.close(); // LINE G

		}

	}
}
