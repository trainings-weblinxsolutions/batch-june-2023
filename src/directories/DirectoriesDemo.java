package directories;

import java.io.File;

public class DirectoriesDemo {
public static void main(String[] args) {
	
	String dirname = "/Users/sabniss/Desktop/java-training/batch-june-2023"; 
	
    File file = new File(dirname); 
    System.out.println(file.getAbsolutePath()); 
    
    
    System.out.println("Is Directory ? :"+file.isDirectory());
    
    if(file.isDirectory()) // LINE C
    {
        System.out.println("Directory of " + dirname);
        String s[] = file.list(); // LINE D
        for(int i = 0; i < s.length; i++)
        {
        	System.out.println("s[i] == "+s[i]);
            File f = new File(dirname + "/" + s[i]);
            ///Users/sabniss/Desktop/java-training/batch-june-2023/.classpath
             // /Users/sabniss/Desktop/java-training/batch-june-2023/bin
            if(f.isDirectory())
            {
                System.out.println(s[i] + " is a directory");
            }
            else
                System.out.println(s[i] + " is a file");
        }

    
        
    }
    else
        System.out.println(dirname + " is not a directory");

}

	
}

