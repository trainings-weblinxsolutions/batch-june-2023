package string;

public class CommonInterviewQuestionsString {
public static void main(String[] args) {
	
	
	/* Q17
	StringBuilder sb = new StringBuilder(-32);
    
    sb.append("ABC");
     
    System.out.println(sb);
    */

	
	/* Q14,15
	System.out.println("Java"+1000+2000+3000);  //
	System.out.println(1000+2000+3000+"Java");  //
	*/
	
	
	/* Q11
	String s1 = "abc";
	String s2 = "abc";
	System.out.println("s1 == s2 is:" + s1);
	System.out.println("s1 == s2 is:" + s1 == s2);
	//"s1 == s2 is:abc" == "abc"
	 * 
	 * */
	 

	/*
	A. false
	B. s1 == s2 is:true --2
	C. s1 == s2 is:false
	D. true

	 * 
	 */
	
	
	
	/* Q10
	String x = "abc";
	String y = "abc";
	x.concat(y);
	System.out.print(x);
*/
	
	
	/* Q9
	
	String s = "Today is Monday";
	System.out.println(s.charAt(s.toUpperCase().length()));
	*/
/*
 * 
A. Runtime Exception -2
B. Prints “y”
C. Prints “Y”

 */
	
	
	
	/* Q8
    String s1 = new String("Monday");
    String s2 = new String("tuesday");
    System.out.println(s1 = s2);

    //false -> 2
    */
	
	
	/*Q7
    String s = new String("5");
    System.out.println(1 + 10 +s+ 1 + 10);
   */


	
	/* Q6
	String s1 = "hello";
    String s2 = new String("hello");
    String s3 = "hello";
    if (s1 == s2) {
        System.out.println("s1 and s2 equal"); //Line 9
    } else {
        System.out.println("s1 and s2 not equal");//Line 11
    }
    if (s1 == s3) {
        System.out.println("s1 and s3 equal");//Line 14
    } else {
        System.out.println("s1 and s3 not equal");//Line 16
    }
    */
}
}


//Line 11,Line 14