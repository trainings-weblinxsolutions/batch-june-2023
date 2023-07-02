package classes_objects;
class AddingMethodToBox7ClassDemo {
  public static void main(String args[]) {
    Box7 myBox71 = new Box7();
    myBox71.width= 10;
    myBox71.height= 6;
    myBox71.depth= 2;       
    
    myBox71.printBox7Details();
    myBox71.volume();
    
     
    Box7 myBox72 = new Box7();
   myBox72.width= 7;
   myBox72.height= 4;
   myBox72.depth= 3;
   myBox72.printBox7Details();
   myBox72.volume();
   
   double sumOfVolume = myBox71.width * myBox71.height * myBox71.depth + myBox72.width * myBox72.height * myBox72.depth;
   System.out.println("sumOfVolume : "+sumOfVolume);
     
    
     
    
    

}

}



class Box7 {

  double width;
  double height;
  double depth;
  
  // method - display volume of a Box7
  void volume() {
    System.out.println("Volume is ::");
    System.out.println(width * height * depth);
  }
  
    void printBox7Details() {
    System.out.println("Box7 Details ::" + " Height : "+height + " Width : "+width + " Depth : "+depth);
   
  }

  
}
