package basics;
public class IfElseLadder {
  public static void main(String args[]) {
  
  
  int age = 55;
  
  if(age < 20) {
  		if(age < 15){
  			System.out.println("You are too young to vote");
  		}
  		else{
  				System.out.println("Just wait a couple of years");
  		}
  }
  else{
  
  	if(age < 40){
  	System.out.println("Thankyou for voting");
  	}
  	else{
  	System.out.println("Special Thankyou for voting");
  	}
  }
  
  
  
  /*
    int month = 4; // April
    String season;
    if(month == 12 || month == 1 || month == 2)
      season = "Winter";
    else if(month == 3 || month == 4 || month == 5)
      season = "Spring";
    else if(month == 6 || month == 7 || month == 8)
      season = "Summer";
    else if(month == 9 || month == 10 || month == 11)
      season = "Autumn";
    else
      season = "Bogus Month";
    System.out.println("April is in the " + season + ".");
    */
  }
}
