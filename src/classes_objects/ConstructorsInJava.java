package classes_objects;
class ConstructorsInJava {
  public static void main(String args[]) {
    Box1 myBox11 = new Box1();    
    myBox11.printBox1Details();
    double volume1 = myBox11.volume();
    System.out.println("Volume of myBox11 is :"+volume1);
    
     
   Box1 myBox12 = new Box1();
   myBox12.printBox1Details();
   double volume2 = myBox12.volume();
   System.out.println("Volume of myBox12 is :"+volume2);   

     
    
    

}

}



class Box1 {

  double width;
  double height;
  double depth;
  
  
// This is the constructor for Box1.
  Box1() {
    System.out.println("Constructing Box1");
    width = 10;
    height = 10;
    depth = 10;
}


//Default Constructor
//Box1(){
//}
  
  
  
  
  double volume() {
    return width * height * depth;
  }
  
    void printBox1Details() {
    System.out.println("Box1 Details ::" + " Height : "+height + " Width : "+width + " Depth : "+depth);
   
  }

  
}
