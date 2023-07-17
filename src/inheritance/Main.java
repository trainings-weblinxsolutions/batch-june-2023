package inheritance;
abstract class X
{
    public X()
    {
        System.out.println("ONE");
    }
     
    abstract void abstractMethod();
}
 
class Y extends X
{
    public Y() 
    {
        System.out.println("TWO");
    }
     
    @Override
    void abstractMethod()
    {
        System.out.println("THREE");
    }
}
 
public class Main
{
    public static void main(String[] args)
    {
        X x = new Y();
         
        x.abstractMethod();
    }
}
