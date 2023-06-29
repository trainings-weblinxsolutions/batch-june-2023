class ConstructorsInJava {
  public static void main(String args[]) {
    Box mybox1 = new Box();    
    mybox1.printBoxDetails();
    double volume1 = mybox1.volume();
    System.out.println("Volume of mybox1 is :"+volume1);
    
     
   Box mybox2 = new Box();
   mybox2.printBoxDetails();
   double volume2 = mybox2.volume();
   System.out.println("Volume of mybox2 is :"+volume2);   

     
    
    

}

}



class Box {

  double width;
  double height;
  double depth;
  
  
// This is the constructor for Box.
  Box() {
    System.out.println("Constructing Box");
    width = 10;
    height = 10;
    depth = 10;
}


//Default Constructor
//Box(){
//}
  
  
  
  
  double volume() {
    return width * height * depth;
  }
  
    void printBoxDetails() {
    System.out.println("Box Details ::" + " Height : "+height + " Width : "+width + " Depth : "+depth);
   
  }

  
}
