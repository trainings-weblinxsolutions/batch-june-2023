package string;

public class StringBufferBasics {
public static void main(String[] args) {
	
	//setCharAt
	StringBuffer sb = new StringBuffer("Good Morning, Thursday");
	System.out.println("Before change : "+sb);
	sb.setCharAt(0, 'H');
	System.out.println("After change : "+sb);
	
	
	//replace
	StringBuffer sb1 = new StringBuffer("C++,Java,C");
	System.out.println("Before : "+sb1);
    sb1.replace(4, 8,"HTMLABD");  
    System.out.println("After : "+sb1);
    
    //insert
    StringBuffer sb2 = new StringBuffer("Hapy");
    System.out.println("Before Insert : "+sb2);
    sb2.insert(2,'d');
    System.out.println("After Insert : "+sb2);
    
    
    //append
    StringBuffer name = new StringBuffer("Rohit");
    System.out.println("Before append : "+name);
    name.append(" Shetty");
    System.out.println("After append : "+name);

    
    
    

}
}
