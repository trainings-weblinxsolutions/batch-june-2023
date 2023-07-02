package arrays;
public class CompareTwoArrays {
   public static void main(String []args) {
   
   int arr1[] = {2,3,6,4,5,7};
   int arr2[] = {2,3,6,5,5};  
   
   
   
   if(arr1.length!=arr2.length){
     System.out.println("False, lengths do not match");
     return;
   } 
   
   System.out.println("Coming on line 14");
   
   int count=0;
   
   
   for(int i=0;i<arr1.length;i++){
   
   if(arr1[i]==arr2[i]){
   	count++;
   }
   
   else{
   	System.out.println("Did not match breaking");
  	 break;
   }
     		
   
   }

  if(count == arr1.length){
  
  System.out.println("True");
  }
  
  else
  
  System.out.println("False");
  
      System.out.println("Program End");
   
   }
   }