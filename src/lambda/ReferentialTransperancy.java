package lambda;

public class ReferentialTransperancy {
	public static void main(String[] args) {
		
       // sumReferential(1, 5);
		//sumReferential(1, 5);
		//sum(1, sum(2, 3));
		sum(1, 5);

	}

	private static int sum(int a, int b) {
		System.out.printf("sumReferential: Adding %d and %d%n", a, b);
		return a + b;
	}

	private static int sumReferential(int a, int b) {
		return a + b;
	}

}
