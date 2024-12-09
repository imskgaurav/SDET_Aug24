package com.testAutomationCentral.in;

public class removeLeadingZeroFromStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	///String s=	trimLeadingZeros("000usjha");
	
	//System.out.println(s);
		
		removeLeadingZeroFromStr  s = new removeLeadingZeroFromStr();
		s.trimLeadingZeros("0000test");
		
	

	}
	
	
	public  String trimLeadingZeros(String src) {
		
		
		//char[] ch = src.toCharArray();
		int count=0;
		
	  for (int j=0; j<src.length(); j++) {
		  
		  char c = src.charAt(j);
		  if(c!='0') {
			  
			  return src.substring(j);
			  
		  }
		  else {
			  count++;
			  System.out.println("zero is found " +count);
		  }
		  System.out.println("Total Zero is:"+count);
	  }
		
		
		
		return "";
	}

}
