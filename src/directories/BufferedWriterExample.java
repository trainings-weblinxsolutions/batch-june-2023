package directories;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {
public static void main(String[] args) throws IOException {
	String content = "This is a new class on Buffered Writer";
	
    File file = new File("/Users/sabniss/Desktop/java-training/batch-june-2023/src/directories/sample_out.txt");
    if (!file.exists()) {
    	System.out.println("File doesnt exist");
    	file.createNewFile();
    }
    
    FileWriter fw = new FileWriter(file.getAbsoluteFile());
    BufferedWriter bw = new BufferedWriter(fw);
    bw.write(content); // LINE A
    bw.close();
    System.out.println("Data written to a file");


}
}
