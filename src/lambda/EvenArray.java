package lambda;

import java.util.Arrays;

public class EvenArray {
public static void main(String[] args) {
	
    int[] array = new int[] {1, 2, 3, 4, 5};
   
    int[] evenArray  = Arrays.stream(array).filter(a -> a % 2 == 0).toArray();//functional programming
    
    System.out.println(Arrays.toString(evenArray));
    
    System.out.println("Normal way");
    
    
    
   
    
    
    
    
    int[] newArray=new int[2];
    int j=0;
    
    for(int i=0;i<array.length;i++) {
    	
    	if(array[i]%2==0) {
    		newArray[j]=array[i];
    		j++;
    	}
    	
    }
    
    for(int i=0;i<newArray.length;i++)
    	System.out.println(newArray[i]);
    
    
   

	
	
}
}
