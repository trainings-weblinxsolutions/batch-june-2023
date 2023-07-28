package utility;

import java.util.StringTokenizer;

public class StringTokenizerDemo {
public static void main(String[] args) {
	
	StringTokenizer st1 = new StringTokenizer("Welcome to Java " +" sessions."); // LINE A
	
	System.out.println("ST1 : "+st1);
		
	while (st1.hasMoreTokens()) {
				System.out.println(st1.nextToken());
		}

	System.out.println("--------------------");
    StringTokenizer st2 = new StringTokenizer("Good morning,Today is," +"Saturday.", "at"); // LINE B
    System.out.println("Count : "+st2.countTokens());
    while (st2.hasMoreTokens()) {
        System.out.println(st2.nextToken());
        
        
    }

	
	
	
}
}
