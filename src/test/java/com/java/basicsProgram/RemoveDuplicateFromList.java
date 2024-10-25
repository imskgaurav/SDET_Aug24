package com.java.basicsProgram;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateFromList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<String> dupList = new ArrayList<String>();
		
		dupList.add("one");
		
		dupList.add("two");
		
		dupList.add("one");
		dupList.add("three");
		dupList.add("two");
		
	System.out.println(dupList);	
	
	Set<String> set = new HashSet<>(dupList);
	
	System.out.println(set);
	
	List<String> noDupList= new ArrayList<>(set);
	
	System.out.println(noDupList);
		
	}

}
