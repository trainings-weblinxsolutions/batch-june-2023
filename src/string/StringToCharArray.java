package string;

public class StringToCharArray {
public static void main(String[] args) {
	
	
	String city = "Hyderabad";
	
	char initial[] = city.toCharArray();
	for(int i=0;i<initial.length;i++) {
		System.out.println(initial[i]);
	}
}
}
