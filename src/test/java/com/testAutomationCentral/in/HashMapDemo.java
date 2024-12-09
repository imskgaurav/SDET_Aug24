package com.testAutomationCentral.in;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
	
	
	public static void hashMap_Funt() {
	
	Map<String, Integer> map1 = new HashMap<>();
	
	map1.put("Rakesh", 40);
	map1.put("Mahesh", 33);
	map1.put("Girish", null);
	
	
	
	System.out.println(map1);
	map1.put("Girish", 100008);
	System.out.println(map1);
	System.out.println( map1.containsKey("Mahesh"));
   System.out.println(    map1.get("Girish"));
//
   
   Set<String> names= map1.keySet();
   
   for(String name: names) {
	   
	   System.out.println(name);
	   System.out.println(map1.get(name));
   }
	
	}
	
	public static void main(String[] args) {
		
		hashMap_Funt();
		
	
		
		
		
	}
}
