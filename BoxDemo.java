class BoxDemo {
  public static void main(String args[]) {
    Box mybox = new Box();
    mybox.width= 100;
    
    System.out.println(mybox.width);
    System.out.println(mybox.height);
    System.out.println(mybox.depth);

}

}



class Box {
  double width;
  double height;
  double depth;
}
