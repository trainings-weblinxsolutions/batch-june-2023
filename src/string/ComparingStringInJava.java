package string;

public class ComparingStringInJava {
public static void main(String[] args) {
	
	String name1 = "Salil";
	String name2 = "Salil";
	System.out.println(name1==name2);//true
	
	
	String name3 = new String("Salil");
	String name4 = new String("Salil");
	System.out.println(name3==name4);//false
	
	
	//Equals methods
	System.out.println(name3.equals(name4));//true
	
	
	System.out.println(name1.equals(name2));//true
	
	
	System.out.println(name1==name4);//false
	System.out.println(name1.equals(name4));//true
	
	
	
	String celebrity1 = "Rajnikanth";
	String celebrity2 = "rajniKantH";
	
	System.out.println("Comparing Celebrity : "+celebrity1.equals(celebrity2));
	System.out.println("Comparing Celebrity : "+celebrity1.equalsIgnoreCase(celebrity2));
	
	
}
}
