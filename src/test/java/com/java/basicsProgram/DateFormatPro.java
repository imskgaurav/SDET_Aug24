package com.java.basicsProgram;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class DateFormatPro {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		final String OLD_FORMAT = "MM/dd/yyyy";
		
		final String New_Format = "EEE MM/dd";
		
		final String finalFormat = "MMM,YYYY dd";  // APR 2023 30
		
		
		String oldDate = "04/20/2023";
		
		String newDate = "";
		
		String arr[] = new String [2];
		
		
		
		SimpleDateFormat sdf = new SimpleDateFormat(OLD_FORMAT);
		
		Date d = sdf.parse(oldDate);
		
		
		System.out.println(d);
		
		
		sdf.applyPattern(New_Format);
		
		
		newDate = sdf.format(d);
		
		
		System.out.println(newDate);
		arr[0] = newDate;
				
		
		//////////////
		
		sdf.applyPattern(finalFormat);
		
		newDate = sdf.format(d);
		
		
		System.out.println(newDate);
		
		arr[1] = newDate;
		
		
		System.out.println(Arrays.asList(arr));
		
		
		
		
		
		
		
				
				
		
		
	
	}

}
