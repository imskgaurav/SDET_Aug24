package com.coreJava.InterviewPrep;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;


public class HashMapVal {

     public static void main(String[] args) {
        
     
     Map<String,Integer> sortedMap = new TreeMap<>();

     sortedMap.put("A",10);
     sortedMap.put("B",10);
     sortedMap.put("C",30);
     sortedMap.put("D",40);
     sortedMap.put("3",50);
      List<Integer> l1=  new ArrayList<>(sortedMap.values());
    Collections.sort(l1);

    for(int i : l1){
        System.out.println(i);

    }

    if(l1.size()<2){

        return;
    }

     int largestVal= l1.get(l1.size()-1);

     System.out.println(largestVal);

     //remove 
     sortedMap.values().removeIf(value->value==largestVal);

     System.out.println(sortedMap);
}
}