package com.java.basicsProgram;

public class Array_Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr1[]= {1,2,3,4};
		
		int arr2[]= {5,6,7,8};
		
	
		
	int arr []=addTwoArraysWithIndex(arr1, arr2);
	
       for(int i : arr) {
    	   
    	   System.out.println(i);
    	   
       }
		//addTwoArraysWithIndex(arr1, arr2);
       //call append METHO
      ///System.out.println();

	}
	
	public  static int[] addTwoArraysWithIndex(int arr[],  int arr1[]) {
		
		
		
		int len1 = arr.length;
		
		int len2 = arr1.length;
		
		int sum [] = new int [len1];
		
		if(len1==len2) {
			
			System.out.println("Addition is Possible ");
			
			
			for (int k= 0; k<len1; k++) {
				
				
				  sum[k] = arr[k]+arr1[k];
				
			}
			
		}
		else {
			
			System.out.println("please check lenght of the both Array");
		}
		
		return sum;
		
  
}
}