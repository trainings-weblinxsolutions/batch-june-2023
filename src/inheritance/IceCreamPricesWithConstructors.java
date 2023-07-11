package inheritance;

public class IceCreamPricesWithConstructors {
public static void main(String[] args) {
	IceCream1 obj = new IceCream1("Orange",2);
	System.out.println("Total price : "+obj.getPrice());
	
	FruitSaladWithIceCream1 fruitSalad = new FruitSaladWithIceCream1("Chocolate", 2, 68);
	System.out.println("Total price for fruitSalad icecream: "+fruitSalad.getPrice());
	
}
}
class IceCream1
{
    String flavor;
    int numberOfScoops;
    
    IceCream1(String flavor, int numberOfScoops)
    {
        this.flavor = flavor;
        this.numberOfScoops = numberOfScoops;
    }
    
    IceCream1(String flavor)
    {
        this.flavor = flavor;
    }
    
    double getPrice()
    {
        double pricePerScoop = 35.0;
        
        return numberOfScoops * pricePerScoop;
    }
}

class FruitSaladWithIceCream1 extends IceCream1
{
    int gramsOfFruitSalad;

    FruitSaladWithIceCream1(String flavor, int numberOfScoops, int gramsOfFruitSalad)
    {
    	super(flavor,numberOfScoops); // LINE A
    	
        this.gramsOfFruitSalad = gramsOfFruitSalad; // LINE B
    }

    double getPrice()
    {
        double iceCreamPrice = super.getPrice(); 
        System.out.println("Icecream Price : "+iceCreamPrice);
        double pricePerGram = 0.75;

        return gramsOfFruitSalad * pricePerGram + iceCreamPrice;
    }
}

