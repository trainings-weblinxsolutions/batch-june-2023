class AddingMethodToBoxClassDemo {
  public static void main(String args[]) {
    Box mybox1 = new Box();
    mybox1.width= 10;
    mybox1.height= 6;
    mybox1.depth= 2;       
    
    mybox1.printBoxDetails();
    mybox1.volume();
    
     
    Box mybox2 = new Box();
   mybox2.width= 7;
   mybox2.height= 4;
   mybox2.depth= 3;
   mybox2.printBoxDetails();
   mybox2.volume();
   
   double sumOfVolume = mybox1.width * mybox1.height * mybox1.depth + mybox2.width * mybox2.height * mybox2.depth;
   System.out.println("sumOfVolume : "+sumOfVolume);
     
    
     
    
    

}

}



class Box {

  double width;
  double height;
  double depth;
  
  // method - display volume of a box
  void volume() {
    System.out.println("Volume is ::");
    System.out.println(width * height * depth);
  }
  
    void printBoxDetails() {
    System.out.println("Box Details ::" + " Height : "+height + " Width : "+width + " Depth : "+depth);
   
  }

  
}
