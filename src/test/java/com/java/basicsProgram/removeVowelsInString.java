package com.java.basicsProgram;

public class removeVowelsInString {

	public static String str= "Automation selenium Api";
	static String vowels = "aeiouAEIOU";
	
  static 	String op= "";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      removeVoewlsFromString(str);
	}
	
	
public static void removeVoewlsFromString(String s) {
	
	      char ch[] = s.toCharArray();
	      
      for(char  a : ch) {
    	  
    	  if(vowels.indexOf(a)==-1) {
    		  
    		  System.out.println("consonent is :"+a);
    		  op= op+a;
    	  }
    	  
    	  else {
    		  
    	System.out.println("vowels is :"+a);
    		  
    	  }
    	  
    	  System.out.println(op);
      }
	
}
	

}
