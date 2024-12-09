package com.coreJava.InterviewPrep;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class MapPratice {

public static void main(String[] args) {
    

    Map<String, Integer> hmap = new HashMap<String, Integer>();
    hmap.put("ST", 56);
    hmap.put("VK", 96);
    hmap.put("HP", 16);
    hmap.put("SS", 76);
    System.out.println(hmap);

       Set<Entry<String,Integer>>allEntries=hmap.entrySet();

       Iterator<Entry<String, Integer>> itr= allEntries.iterator();

       while(itr.hasNext()){

        Entry<String, Integer>nextEntry= itr.next();

        System.out.println(nextEntry.getKey());
        System.out.println(nextEntry.getValue());

       }
    
    //
    //TreeMap<String, Integer> tmap = new TreeMap<>(hmap);
    //System.out.println(tmap);


    
}
}
