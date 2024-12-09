package com.java.basicsProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ReverseArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> arr =  new ArrayList<>();
		
		arr.add(3);
		arr.add(5);
		arr.add(7);
		
		
		System.out.println(arr);
		
		Collections.reverse(arr);
		
		System.out.println(arr);
		//https://www.javatpoint.com/java-collections-reverseorder-method#:~:text=%E2%86%92%20%E2%86%90%20prev-,Java%20Collections%20reverseOrder()%20Method,differentiated%20depending%20on%20its%20parameter.
        List<String> list = Arrays.asList("Java", "Python", "Ruby", "COBOL");  
		Collections.sort(list, Collections.reverseOrder());
		
		System.out.println(list);
		
	
	}

}
