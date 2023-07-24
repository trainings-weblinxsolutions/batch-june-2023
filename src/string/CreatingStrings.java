package string;

public class CreatingStrings {
public static void main(String[] args) {
	String s = "Hello World";
	
	System.out.println(s);
	
	
	String s1 = new String("Hello World new String");
	System.out.println(s1);
	
	
	char c[] = {'j', 'a', 'v', 'a',',','i','s',' ','a',' ','g','o','o','d'};
	String s2 = new String(c);
	System.out.println(s2);

}
}
