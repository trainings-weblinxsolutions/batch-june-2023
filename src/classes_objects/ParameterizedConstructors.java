package classes_objects;
class ParameterizedConstructors {
  public static void main(String args[]) {
  
  Box2 myBox21 = new Box2(12,7,5);
  System.out.println("H : "+myBox21.height);
  
  /*
   Box2 myBox22 = new Box2();
   System.out.println("H : "+myBox22.height);
   
   
    Box2 myBox23 = new Box2(5);
   System.out.println("H : "+myBox23.height);

   */
    

}

}



class Box2 {
  
  double width;
  double height;
  double depth;
  
  // constructor used when all dimensions specified
  Box2(double w, double h, double d) {
  	System.out.println("In Box2 constructor - taking params");
    width = w;
    height = h;
    depth = d;
}

  // constructor used when no dimensions specified
  Box2() {
  	System.out.println("In Box2 constructor - no params");  
    width = -1;  // use -1 to indicate
    height = -1; // an uninitialized
    depth = -1;  // Box2
}

  // constructor used when cube is created
  Box2(double len) {
  	System.out.println("In Box2 constructor - one param being passed");  
  
    width = height = depth = len;

  }


  
  
}


