package com.seleniumProg.Dec2024;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class DuplicateFromListUsingStream {
	//https://www.benchresources.net/java-8-how-to-remove-duplicates-from-arraylist/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = Arrays.asList(2, 3, 4, 2, 4, 5, 6, 3);
		
		List<Integer> outPut = list.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(outPut);
		
		
		System.out.println(outPut.get(0));

	}

}
