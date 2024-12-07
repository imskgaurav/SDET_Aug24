package com.coreJava.InterviewPrep;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class SortingHashMap {

    public static void main(String[] args) {

    HashMap<String,Integer> hMap = new HashMap<>();
      TreeMap<String,Integer> sortedMap = new TreeMap<>();
      hMap.put("Akshay",5);
      hMap.put("Veer",8);
      hMap.put("Guang",3);
      hMap.put("Bakshi",7);
      hMap.put("TomTom",2);
      hMap.put("Chang",10);
      hMap.put("Sandy",1);
      System.out.println(hMap);
      sortedMap.putAll(hMap);
      System.out.println(sortedMap);

      //Retrieve All the keys //
       Set<String> keys= sortedMap.keySet();
      Iterator<String> itr = keys.iterator();
      while(itr.hasNext()){
        String ky=itr.next();

        System.out.print("Keys is :"+ky);

        System.out.print("Value is:" +sortedMap.get(ky));

        System.out.println();


      }



       



    }

}
