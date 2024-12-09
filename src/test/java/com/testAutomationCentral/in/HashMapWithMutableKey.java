package com.testAutomationCentral.in;

import java.util.*;

public class HashMapWithMutableKey {
	
	
	private static  void immutableKeyDemo() {
		
		List<Integer> list = new ArrayList<>();		
		list.add(1);
		
		Map<List<Integer>, Integer> map1= new HashMap<>();
		map1.put(list, 2);
		//list.add(3);
		System.out.println(map1.get(list));
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 immutableKeyDemo();

	}

}
