package classes_objects;
class ParameterizedConstructorsInJava {
  public static void main(String args[]) {
    Box3 myBox31 = new Box3(5,8,12);    
    myBox31.printBox3Details();
    double volume1 = myBox31.volume();
    System.out.println("Volume of myBox31 is :"+volume1);
    
     
   Box3 myBox32 = new Box3(3,8,6);
   myBox32.printBox3Details();
   double volume2 = myBox32.volume();
   System.out.println("Volume of myBox32 is :"+volume2);   

     
    
    

}

}



class Box3 {

  double width;
  double height;
  double depth;
  
  
// This is the parameterized constructor for Box3.
 Box3(double w, double h, double d) {
    width = w;
    height = h;
    depth = d;
}



  
  
  
  double volume() {
    return width * height * depth;
  }
  
    void printBox3Details() {
    System.out.println("Box3 Details ::" + " Height : "+height + " Width : "+width + " Depth : "+depth);
   
  }

  
}
