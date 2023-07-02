package classes_objects;

class BoxDemo {
  public static void main(String args[]) {
    Box mybox1 = new Box();
    mybox1.width= 10;
    mybox1.height= 6;
    mybox1.depth= 2;        
    System.out.println("Width is : "+mybox1.width);
    System.out.println("Height is : "+mybox1.height);
    System.out.println("Depth is : "+mybox1.depth);
    
    double volume = mybox1.width * mybox1.height * mybox1.depth;

	System.out.println("Volume of the mybox1 object is :"+volume);
		
	
	Box mybox2 = new Box();
    mybox2.width= 12;
    mybox2.height= 8;
    mybox2.depth= 9; 
    
    volume = mybox2.width * mybox2.height * mybox2.depth;       
	System.out.println("Volume of the mybox2 object is :"+volume);
	
	Box mybox3 = new Box();
    mybox3.width= 2;
    mybox3.height= 4;
    mybox3.depth= 5; 
    
    volume = mybox3.width * mybox3.height * mybox3.depth;       
	System.out.println("Volume of the mybox3 object is :"+volume);	

}

}



class Box {

  double width;
  double height;
  double depth;
  
  
}
