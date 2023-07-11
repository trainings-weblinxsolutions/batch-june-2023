package basics;

public class PrintingArray {
	public static void main(String[] args) {

		T t1 = new T();
		System.out.println(t1.t);

	}
}

class T {
	int t = 20;

	T() {
		t = 40;
	}
}
