package arrays;
public class ArraysInJava {
   public static void main(String []args) {
   
//   int arr[] = new int[6];

//	int arr[] = {5,8,10,14,23,42,100,200};

	int []arr = {5,8,10,14,23,42,100,200};
	
//	System.out.println(arr[1]);
	
	arr[1] = 15;
	/*
	System.out.println(arr[0]);
	System.out.println(arr[1]);
	System.out.println(arr[2]);
	System.out.println(arr[3]);
	System.out.println(arr[4]);
	System.out.println(arr[5]);		
	*/
	
	for(int i=0 ; i < arr.length ; i++){
		//System.out.println(arr[i]);		
	}		
	
	//System.out.println(arr.length);
	
	 int marks[] = new int[3];
	// int []marks = new int[3];
	// int[] marks = new int[3];
 	//  int [] marks = new int[3];	 	 
	 marks[0]=9;
	// marks[1]=5;
	 marks[2]=7;	 	 
	
	System.out.println(marks[0]);
//	System.out.println(marks[10]); this will give us ArrayIndexOutOfBoundsException
	
	 
	 for(int i=0 ; i < marks.length ; i++){
		System.out.println(marks[i]);		
	}	
	 
   
   
   }
   }