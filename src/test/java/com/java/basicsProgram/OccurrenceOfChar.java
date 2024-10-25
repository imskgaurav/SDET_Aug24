package com.java.basicsProgram;

public class OccurrenceOfChar {

	
	static int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
      occurencesOfChar("ballon in box", 'b');

	}

	
	public static void occurencesOfChar(String s, char c) {
		
		char[] ch = s.toCharArray();
		
		for (char x : ch) {
			
			System.out.print(" "+x);
			
			if(x==c) {
				 count++;
				
			}
		}
		
		System.out.println(count);
		
	}
}
