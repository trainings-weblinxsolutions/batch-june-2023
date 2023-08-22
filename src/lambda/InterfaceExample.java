package lambda;


interface MyName1{  
    public void SayMyName();
} 




public class InterfaceExample {
	public static void main(String[] args) {
		Demo d1 = new Demo();
		d1.SayMyName();
		
		Demo d2 = new Demo();
		d2.SayMyName();
	}

}



class Demo implements MyName1{

	@Override
	public void SayMyName() {
		System.out.println("Good evening!");
		
	}
	
	
}
