package com.testAutomationCentral.in;

public class ConvertInt2Str {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String d= convertInt2StrVal(89);
		
		System.out.println(d+90);
		
		

	}
	
	
static String  convertInt2StrVal(Integer i) {
	
	
	
	String str = "";
	
	str = str+Integer.valueOf(i);
	return str;
	
	
	
}

}
