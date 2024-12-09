package com.java.basicsProgram;

public class VowelsInString {


	static String vowels = "aeiouAEIOU";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		findVowelsCountInString("INDIA is Country");
		

	}
  public static void  findVowelsCountInString(String str) {
	  
	        char[]  ch= str.toCharArray();
	        
	          for (char x : ch) {
	        	  
	        	    if(vowels.indexOf(x)==-1) {
	        	    	
	        	    	System.out.println("its Consonent");
	        	    }
	        	    
	        	    else {
	        	    	
	        	    	System.out.println("Vowels Found in String is :"+x);
	        	    }
	          }
	  
	  
  }
}
