package arrays;
public class FindMinMaxInAArray {
   public static void main(String []args) {
   
   
   int a[] = {-3,-4,-5,-1,-8,-9,-1,-7}; //max = -1
   
   // max = 9
   
   
   int max = a[0];
   int min = a[0];
   
   for( int i = 1 ; i < a.length ; i++){
   
   	if(a[i] > max){
   	
   		max = a[i];
   	}
   	
   	if(a[i] < min){
   	
   		min = a[i];
   	}
   
   
   }
   
   System.out.println(max);
   System.out.println(min);
   
   
   
   
   
   
   
   
   
   // min = -1
   
   }
   }
   