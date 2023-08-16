package directories;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {
public static void main(String[] args) throws IOException {
	File file = new File(
			"/Users/sabniss/Desktop/java-training/batch-june-2023/src/abstract_classes/CalculateAreas.java");
	
	
	BufferedReader br = new BufferedReader(new FileReader(file));
	
	String line;
	int countOfLines=0;
	
	while((line=br.readLine())!=null)  
	{  

		countOfLines++;
		System.out.println(line);
	}  
	System.out.println("No of lines : "+countOfLines);

	
//	System.out.println((char) br.read());
//	System.out.println((char) br.read());
//	System.out.println(br.readLine());
//	System.out.println(br.readLine());
//	System.out.println((char) br.read()); //p
//	System.out.println((char) br.read()); //a
//	System.out.println(br.readLine());
//	System.out.println(br.readLine());
	
//	boolean ready = false;
//    ready = br.ready(); 
//    System.out.println("BR Ready : "+ready);
//	br.skip(6); 
//	System.out.println((char) br.read());

}
}
