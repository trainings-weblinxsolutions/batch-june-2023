package inheritance;
public class AccessModifiersExample {

	public static void main(String[] args) {
		
		
		Bottle b = new Bottle();
//		b.amountOfWater = 7;
//		System.out.println("Amount in bottle : "+b.amountOfWater);
		
		
		b.setAmountOfWater(7);
		System.out.println("Amount in bottle : "+b.getAmountOfWater());
		
		//b.amountOfWater = 100;
		//System.out.println("Amount in bottle : "+b.amountOfWater);
		b.setAmountOfWater(100);
		System.out.println("Amount in bottle : "+b.getAmountOfWater());
		
	}
}


class Bottle{
	
	 protected int amountOfWater; // contain max 20L of water

	public int getAmountOfWater() {
		return amountOfWater;
	}

	public void setAmountOfWater(int amountOfWater) {
		
		if(amountOfWater > 0 && amountOfWater <=20)
			this.amountOfWater = amountOfWater;
	}
	
	//getters and setter in Java
	
	
	
	
	
	
}

