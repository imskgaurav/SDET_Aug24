package com.coreJava.InterviewPrep;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class TestMap {

    public static void main(String[] args) {

       Map<Integer, String> map = new HashMap<>();

      map.put(1, "ONE");
      map.put(2, "TWO");


      Set<Integer> keySet= map.keySet();

      Iterator it = keySet.iterator();

      while(it.hasNext()){

       Integer key = (Integer)it.next();
        System.out.println(key);

        String val = map.get(key);
        System.out.println(val);
      }

      
        
        
    }

}
