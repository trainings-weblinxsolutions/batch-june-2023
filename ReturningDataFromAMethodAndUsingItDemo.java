class ReturningDataFromAMethodAndUsingItDemo {
  public static void main(String args[]) {
    Box mybox1 = new Box();
    mybox1.width= 10;
    mybox1.height= 6;
    mybox1.depth= 2;       
    
    mybox1.printBoxDetails();
   // double volume1 = mybox1.volume();
    //System.out.println("Volume is :"+volume1);
    
     
   Box mybox2 = new Box();
   mybox2.width= 7;
   mybox2.height= 4;
   mybox2.depth= 3;
   mybox2.printBoxDetails();
  // double volume2 = mybox2.volume();
   
  //   System.out.println(volume1+volume2);
  
  System.out.println(mybox1.volume() + mybox2.volume());
    
     
    
    

}

}



class Box {

  double width;
  double height;
  double depth;
  
  // method - display volume of a box
  double volume() {
    System.out.println("Volume is ::");
    System.out.println(width * height * depth);
    return width * height * depth;
  }
  
    void printBoxDetails() {
    System.out.println("Box Details ::" + " Height : "+height + " Width : "+width + " Depth : "+depth);
   
  }

  
}
