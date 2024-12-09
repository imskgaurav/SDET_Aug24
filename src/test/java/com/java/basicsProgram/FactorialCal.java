
package com.java.basicsProgram;
public class FactorialCal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long result = factorialVal(10);
		
		System.out.println(result);

	}
	
	static int factorialVal(int num ) {
		int fact=1;
		
		if(num==0) {
			
		return fact;
		}
		
		return (num*factorialVal(num-1));
	}

}
