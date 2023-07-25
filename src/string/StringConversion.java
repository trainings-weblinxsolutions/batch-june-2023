package string;

public class StringConversion {
public static void main(String[] args) {
	int a = 10;
    float b = 20.5f;
    char c = 'd';
    double d = 19.5;
    System.out.println(a + b + c + d);
    
    String s1 = Integer.toString(a);
    String s2 = Float.toString(b);
    String s3 = Character.toString(c);
    String s4 = Double.toString(d);
    System.out.println(s1 + " " + s2+ " " + s3 + " " + s4);
    
   String s5 = a+"";
}
}
