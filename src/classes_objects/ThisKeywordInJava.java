package classes_objects;
class ThisKeywordInJava {
  public static void main(String args[]) {
    Box6 myBox61 = new Box6(5,8,12);    
    myBox61.printBox6Details();
    double volume1 = myBox61.volume();
    System.out.println("Volume of myBox61 is :"+volume1);
    
    
    
   //   
//    Box6 myBox62 = new Box6(3,8,6);
//    myBox62.printBox6Details();
//    double volume2 = myBox62.volume();
//    System.out.println("Volume of myBox62 is :"+volume2);   

     
    
    

}

}



class Box6 {

  double width;
  double height;
  double depth;
  
  
// This is the parameterized constructor for Box6.
 Box6(double width, double height, double depth) {
    this.width = width;
    this.height = height;
    this.depth = depth;
}



// // This is the parameterized constructor for Box6.
//  Box6(double w, double h, double d) {
//     width = w;
//     height = h;
//     depth = d;
// }

  
  
  
  double volume() {
    return width * height * depth;
  }
  
    void printBox6Details() {
    System.out.println("Box6 Details ::" + " Height : "+height + " Width : "+width + " Depth : "+depth);
   
  }

  
}
