class PassingParametersToTheMethod {
  public static void main(String args[]) {
    Box mybox1 = new Box();
    mybox1.setDim(10,6,5);
    
    mybox1.printBoxDetails();
    double volume1 = mybox1.volume();
    System.out.println("Volume of mybox1 is :"+volume1);
    
     
   Box mybox2 = new Box();
   mybox2.setDim(6,9,13);
   mybox2.printBoxDetails();
   double volume2 = mybox2.volume();
   System.out.println("Volume of mybox2 is :"+volume2);   

     
    
    

}

}



class Box {

  double width;
  double height;
  double depth;
  
  
    // sets dimensions of box
	  void setDim(double w, double h, double d) {
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
