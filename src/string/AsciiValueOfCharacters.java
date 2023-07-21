package string;

public class AsciiValueOfCharacters {
public static void main(String[] args) {
	
    char ch = 'a';
    
    System.out.println(ch);
    
    
    int num = 98;
    System.out.println(num);
    
    int anyNumber = 'z';
    System.out.println("This : "+anyNumber);
    
    char anyChar = (char)num;
    System.out.println(anyChar);
    
    System.out.println("--- Converting Numbers to characters ---");
    
    for(int i=0 ; i <=127;i++) {
    	
    	System.out.println(i + " :: " + (char)i);
    }
//	
	
	
}
}
