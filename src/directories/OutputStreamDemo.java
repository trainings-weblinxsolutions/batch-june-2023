package directories;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamDemo {
public static void main(String[] args) throws IOException {
	File f = new File("/Users/sabniss/Desktop/java-training/batch-june-2023/src/directories/sample3.txt");
	
	
	
	OutputStream os = new FileOutputStream(f); 
//	
	if(f.exists()) // LINE C
    {
        System.out.println("File exists.");
        
        byte b[] = {'j','a','v','a'};
       // Writing into file fileOne
        os.write(b);
        System.out.println("Data written to file");

    }
    os.close();
}
}
