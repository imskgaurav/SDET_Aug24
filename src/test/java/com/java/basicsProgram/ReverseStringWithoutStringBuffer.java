package com.java.basicsProgram;

public class ReverseStringWithoutStringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println(invertWithoutStringBuffer("govind Gopal"));
	}

	public static String invertWithoutStringBuffer(String str) {
		
		String revStr= "";
		
		String s= str;
		
		for (int i=str.length()-1;i>=0; i--)
		{
			revStr= revStr+s.charAt(i);
			
			
		}
		
		return revStr;
		
	}
}
