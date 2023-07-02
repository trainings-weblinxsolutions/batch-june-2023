package classes_objects;
class BoxDemo1 {
  public static void main(String args[]) {
    Box mybox1 = new Box();
    mybox1.width= 10;
    mybox1.height= 6;
    mybox1.depth= 2;       
    
    System.out.println("Mybox1 : " + " Width :" +mybox1.width + " Height : "+mybox1.height + " Depth : "+mybox1.depth );
     
    Box mybox2 = mybox1;
    
    System.out.println("Mybox2 : " + " Width :" +mybox2.width + " Height : "+mybox2.height + " Depth : "+mybox2.depth );
   //    Mybox1 :  Width :10.0 Height : 6.0 Depth : 2.0
  //	Mybox2 :  Width :10.0 Height : 6.0 Depth : 2.0
    
    
    mybox2.width = 15;
    mybox1.height = 20;
    
    System.out.println("Volume of mybox1 :" + (mybox1.width * mybox1.height * mybox1.depth));
    
    System.out.println("Mybox1 : " + " Width :" +mybox1.width + " Height : "+mybox1.height + " Depth : "+mybox1.depth );
    System.out.println("Mybox2 : " + " Width :" +mybox2.width + " Height : "+mybox2.height + " Depth : "+mybox2.depth );  
    //  Mybox1 :  Width :10.0 Height : 6.0 Depth : 2.0
   //	Mybox2 :  Width :15.0 Height : 6.0 Depth : 2.0      
    
        System.out.println("Volume of mybox2 :" + (mybox2.width * mybox2.height * mybox2.depth));
    
   Box mybox3 =mybox1;
 System.out.println("Mybox3 : " + " Width :" +mybox3.width + " Height : "+mybox3.height + " Depth : "+mybox3.depth );   
 //mybox3 = null;
 
     System.out.println("Mybox1 : " + " Width :" +mybox1.width + " Height : "+mybox1.height + " Depth : "+mybox1.depth );
    

}

}
