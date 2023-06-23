public class SumOfNumbersInAnArray {
   public static void main(String []args) {
   
   int marks[]={87,76,44,35,90,87,45,23,77,54,83,56,79};	
   
   int sumOfMarks=0;
   
   for(int i=0;i<marks.length;i++){
   	sumOfMarks = sumOfMarks+marks[i];
   }
   System.out.println(sumOfMarks);
   
   
}
}   