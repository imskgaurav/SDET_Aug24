package com.coreJava.InterviewPrep;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.List;

import java.util.Map;
import java.util.Map.Entry;
public class DuplicateFromArray_withSet {

    public static void main(String[] args) {

    int [] chk = {1,2,3,2,1,3,5,6,7,7};

    List<Integer> liFinal=findDuplicateUsing_Set(chk);

    System.out.println(liFinal);

    //duplicateUsingHashMap(chk);


        
    }

    static List<Integer> findDuplicateUsing_Set(int arr[]){

      Set<Integer> finalSet= new HashSet<Integer>();

      List<Integer> li= new ArrayList<Integer>();

      for(int element: arr){

        if(!finalSet.add(element)){

              System.out.println("Duplicate Found");

              li.add(element);
        }

    

      }
    return li;




    }

    public static  void duplicateUsingHashMap(int arr[]){

       Map<Integer, Integer> map = new HashMap<Integer, Integer>();

       for(Integer e: arr){

        if(map.containsKey(e)){

          map.put(e, map.get(e)+1);
        }
        else{

            map.put(e, 1);
        }

         

       }
       System.out.println("Final HashMap is :" +map);

       Set<Entry<Integer, Integer>> entrySet= map.entrySet();

       for(Entry<Integer, Integer> entry : entrySet) {

           if(entry.getValue()>1){

            System.out.println("Duplicate Entry is :" +entry.getKey());
           }
       }


       
    

    }

}
