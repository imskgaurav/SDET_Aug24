package com.java.basicsProgram;

import java.util.Arrays;

public class mergeArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {2,3,4};
		
		int b[] = {11, 22, 33};
		
		System.out.println(Arrays.toString(a));
		
		System.out.println(Arrays.toString(b));
		
		
    int len= a.length+b.length;
    
    System.out.println(len);
    
    int mArr[]= new int[len];
    for (int i=0;i<a.length; i++) {
    	
    	mArr[i]= a[i];
    	
    	System.out.println(Arrays.toString(mArr));
    	
    	
    	
    }
    
    for (int j =0; j<b.length; j++) {
    	
    	mArr[a.length+j]= b[j];
    	System.out.println(Arrays.toString(mArr));
    }

	}

}
