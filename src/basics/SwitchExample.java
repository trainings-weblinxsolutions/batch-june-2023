package basics;
public class SwitchExample {
   public static void main(String []args) {


    int number = 42;
    char size;

    // switch statement to check size
    switch (number) {

        
      case 29:
        size = 'S';
        break;

      case 42:
        size = 'M';
        break;

      // match the value of week
      case 44:
        size = 'L';
       // System.out.println("Thankyou for choosing T-shirts from this size");
        break;

      case 48:
        size = 'X';
        break;
        
      default:
        size = 'S';
        break;        
      


    }
    System.out.println(size);



   
   }
}