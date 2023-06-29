class ParameterizedConstructorsInJava {
  public static void main(String args[]) {
    Box mybox1 = new Box(5,8,12);    
    mybox1.printBoxDetails();
    double volume1 = mybox1.volume();
    System.out.println("Volume of mybox1 is :"+volume1);
    
     
   Box mybox2 = new Box(3,8,6);
   mybox2.printBoxDetails();
   double volume2 = mybox2.volume();
   System.out.println("Volume of mybox2 is :"+volume2);   

     
    
    

}

}



class Box {

  double width;
  double height;
  double depth;
  
  
// This is the parameterized constructor for Box.
 Box(double w, double h, double d) {
    width = w;
    height = h;
    depth = d;
}



  
  
  
  double volume() {
    return width * height * depth;
  }
  
    void printBoxDetails() {
    System.out.println("Box Details ::" + " Height : "+height + " Width : "+width + " Depth : "+depth);
   
  }

  
}
