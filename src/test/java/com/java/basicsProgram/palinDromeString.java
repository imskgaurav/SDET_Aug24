package com.java.basicsProgram;

public class palinDromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= "nowsirawariswon";
		boolean f =false;
		try {
		f=validateIsPalinDrome(s);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(f);

	}
	
	
	public static boolean validateIsPalinDrome(String s) {
		
		
		int i,j;
		for( i=0,j=s.length()-1; i<j; i++,j--) {
		
			
		   if( s.charAt(i)!=s.charAt(j)) {
			   
			   System.out.println("Compare char");
			   return false;
		   }
			
		   System.out.println("same char:" +s.charAt(i));
		}
		
		
		return true;
	}

}
