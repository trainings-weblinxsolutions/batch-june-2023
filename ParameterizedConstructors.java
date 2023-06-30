class ParameterizedConstructors {
  public static void main(String args[]) {
  
  Box mybox1 = new Box(12,7,5);
  System.out.println("H : "+mybox1.height);
  
  /*
   Box mybox2 = new Box();
   System.out.println("H : "+mybox2.height);
   
   
    Box mybox3 = new Box(5);
   System.out.println("H : "+mybox3.height);

   */
    

}

}



class Box {
  
  double width;
  double height;
  double depth;
  
  // constructor used when all dimensions specified
  Box(double w, double h, double d) {
  	System.out.println("In Box constructor - taking params");
    width = w;
    height = h;
    depth = d;
}

  // constructor used when no dimensions specified
  Box() {
  	System.out.println("In Box constructor - no params");  
    width = -1;  // use -1 to indicate
    height = -1; // an uninitialized
    depth = -1;  // box
}

  // constructor used when cube is created
  Box(double len) {
  	System.out.println("In Box constructor - one param being passed");  
  
    width = height = depth = len;

  }


  
  
}


