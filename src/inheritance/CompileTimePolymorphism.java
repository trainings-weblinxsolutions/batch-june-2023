package inheritance;

public class CompileTimePolymorphism {
public static void main(String[] args) {
	ArithmeticUtils obj = new ArithmeticUtils();
	
	System.out.println(obj.add(10, 10));
}
}

class ArithmeticUtils {
	int add(int a, int b) // LINE A
	{
		return a + b;
	}


	int add(int a, int b, int c) // LINE B
	{
		return a + b + c;
	}

	double add(double a, double b, double c) // LINE C
	{
		return a + b + c;
	}

	int multiply(int a, int b) {
		return a * b;
	}

	int multiply(int a, int b, int c) {
		return a * b * c;
	}

	double add(int a, double b) {
		return a + b;
	}

	double add(int a, double b, int c, double d) {
		return a + b + c + d;
	}
}