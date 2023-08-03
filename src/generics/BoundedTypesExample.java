package generics;

public class BoundedTypesExample {
public static void main(String[] args) {
	
	//1+1
	//1.25+4.5
	//Addition<String> obj = new Addition("12"); //This is not allowed since we are used Bounded types
	Addition<Integer> obj1 = new Addition(12);
	Addition<Double> obj2 = new Addition(12);
	Addition<Float> obj3 = new Addition(12);
}
}


class Addition<T extends Number>{
	
	T value;
	
	public Addition(T value) {
		this.value=value;
	}
	
	public T add() {
		return value;
	}
	
}
