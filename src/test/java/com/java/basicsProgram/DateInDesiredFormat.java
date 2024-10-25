package com.java.basicsProgram;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;



public class DateInDesiredFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDateTime dt = LocalDateTime.now();
		
		System.out.println(dt);
		
		//DateTimeFormatter df = DateTimeFormatter.ofPattern("MM/YY --E");
		//DateTimeFormatter df = DateTimeFormatter.ofPattern("EEE MM/YY");//
		DateTimeFormatter df2 =DateTimeFormatter.ofPattern("EEE MMM,YYYY dd");
		String myDate = dt.format(df2);
		
		System.out.println(myDate);
		
	    myDate = dt.format(df2);
	    
	    System.out.println(myDate);
		
		
	}

}
