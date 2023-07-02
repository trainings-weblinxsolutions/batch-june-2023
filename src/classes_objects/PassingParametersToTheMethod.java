package classes_objects;
class PassingParametersToTheMethod {
  public static void main(String args[]) {
    Box4 myBox41 = new Box4();
    myBox41.setDim(10,6,5);
    
    myBox41.printBox4Details();
    double volume1 = myBox41.volume();
    System.out.println("Volume of myBox41 is :"+volume1);
    
     
   Box4 myBox42 = new Box4();
   myBox42.setDim(6,9,13);
   myBox42.printBox4Details();
   double volume2 = myBox42.volume();
   System.out.println("Volume of myBox42 is :"+volume2);   

     
    
    

}

}



class Box4 {

  double width;
  double height;
  double depth;
  
  
    // sets dimensions of Box4
	  void setDim(double w, double h, double d) {
		width = w;
		height = h;
		depth = d; 
	}

  
  
  
  
  double volume() {
    return width * height * depth;
  }
  
    void printBox4Details() {
    System.out.println("Box4 Details ::" + " Height : "+height + " Width : "+width + " Depth : "+depth);
   
  }

  
}
