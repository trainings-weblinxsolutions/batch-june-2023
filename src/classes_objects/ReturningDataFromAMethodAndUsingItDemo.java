package classes_objects;
class ReturningDataFromAMethodAndUsingItDemo {
  public static void main(String args[]) {
    Box5 myBox51 = new Box5();
    myBox51.width= 10;
    myBox51.height= 6;
    myBox51.depth= 2;       
    
    myBox51.printBox5Details();
   // double volume1 = myBox51.volume();
    //System.out.println("Volume is :"+volume1);
    
     
   Box5 myBox52 = new Box5();
   myBox52.width= 7;
   myBox52.height= 4;
   myBox52.depth= 3;
   myBox52.printBox5Details();
  // double volume2 = myBox52.volume();
   
  //   System.out.println(volume1+volume2);
  
  System.out.println(myBox51.volume() + myBox52.volume());
    
     
    
    

}

}



class Box5 {

  double width;
  double height;
  double depth;
  
  // method - display volume of a Box5
  double volume() {
    System.out.println("Volume is ::");
    System.out.println(width * height * depth);
    return width * height * depth;
  }
  
    void printBox5Details() {
    System.out.println("Box5 Details ::" + " Height : "+height + " Width : "+width + " Depth : "+depth);
   
  }

  
}
