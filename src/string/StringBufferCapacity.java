package string;

public class StringBufferCapacity {
public static void main(String[] args) {
	
	
	StringBuffer buff = new StringBuffer();
	System.out.println("Length : "+buff.length());	//0
	System.out.println("Capacity : "+buff.capacity()); //16
	
	
	
    buff = new StringBuffer("Java"); 
    System.out.println("Length after adding a word : "+buff.length());	//0
	System.out.println("Capacity after adding a word : "+buff.capacity()); //20 default capacity + length
	
	System.out.println("---------------------------------------------");
	
	StringBuffer sb = new StringBuffer(6);
	System.out.println("SB Initial capacity : " + sb.capacity());
	sb.append("Happy Diwali to all");
	System.out.println("The value of sb: "+sb);//Happy Diwali
	System.out.println("Length of sb : "+sb.length());//12
	System.out.println("SB Updated capacity : "+sb.capacity());

	
	
	
	
	
}
}
