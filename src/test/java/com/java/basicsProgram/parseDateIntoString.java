package com.java.basicsProgram;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class parseDateIntoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SimpleDateFormat formatDate = new SimpleDateFormat("MM/dd/yyyy");
		
		String input = args.length==0?"03/30/2023" : args[0];
		
		System.out.println(input +"is Parse as");
		
		Date t; 
		
		try {
			 t = formatDate.parse(input);
			 
			 System.out.println(t);
			
			
		} catch(ParseException pe) {
			
			System.out.println("The String is Unparsable"+formatDate);
			
		}
		
		

	}

}
