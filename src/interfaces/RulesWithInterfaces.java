package interfaces;

public class RulesWithInterfaces {

}


interface IA
{
    public static final double PI = 3.14;
    static double PI_3 = 3.14;

	
    void method1();
    
    int method2(int x, int y);
}

class Example implements IA
{

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int method2(int x, int y) {
		// TODO Auto-generated method stub
		return 0;
	}
   
}
