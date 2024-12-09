
package com.java.basicsProgram;
import java.util.Collection;
import java.util.HashMap;

public class hashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      HashMap<String, String>hm = new HashMap<String, String>();
		
		hm.put("#5da423", "BLACK");
		//hm.put(key, value)
//		Collection<String> values = hm.values();
//		String val =hm.get("#5da423");
//		String value = hm.get("my_code");
		String val= "";
		if(!hm.containsKey("#5da423")) {
			
			System.out.println("HexCode is NOT aDDED ");
		}
		
		else {
			
			
			val =hm.get("#5da423");
		}
		
			
		}
	}

