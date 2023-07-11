package inheritance;

public class IceCreamPricesWithOverriding {
public static void main(String[] args) {
	
    IceCream ic = new IceCream();
    ic.flavor = "Pista";
    ic.numberOfScoops = 2;
    
    System.out.println(ic.numberOfScoops + " scoops of " + ic.flavor + " flavor price is : " + ic.getPrice());

    FruitSaladWithIceCream fs = new FruitSaladWithIceCream();
    fs.flavor = "Chocolate";
    fs.numberOfScoops = 1;
    fs.gramsOfFruitSalad = 50;
    
    System.out.print(fs.gramsOfFruitSalad + " grams of fruit salad and ");
    System.out.println(fs.numberOfScoops + " scoops of " + fs.flavor + " flavor price is : " + fs.getPrice());

	
	
}
}
class IceCream
{
    String flavor;
    int numberOfScoops;
    
    double getPrice()
    {
        double pricePerScoop = 35.0;
        return numberOfScoops * pricePerScoop;
    }
}

class FruitSaladWithIceCream extends IceCream
{
    int gramsOfFruitSalad;

    double getPrice()
    {
        double iceCreamPrice = super.getPrice(); // LINE A
        double pricePerGram = 0.75;

        return gramsOfFruitSalad * pricePerGram + iceCreamPrice;
    }
}
class KhubaniKaMeetaWithIceCream extends IceCream
{
    int gramsOfKhubaniKaMeeta;

    double getPrice()
    {
        double iceCreamPrice = super.getPrice(); // LINE B
        double pricePerGram = 1.25;
        return gramsOfKhubaniKaMeeta * pricePerGram + iceCreamPrice;
    }
}

