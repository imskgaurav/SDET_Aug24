package com.coreJava.InterviewPrep;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.*;

public class RemoveDuplicateFromArray_LinkedHashSet {


    public static void main(String[] args) {
   Integer arr [] = {1, 10, 2, 2, 10, 3, 3, 3, 4, 5, 5};
   List li1=  Arrays.asList(arr);

        List li2= li1.stream().distinct().toList();

       // System.out.println("List 2:"+li2);
 //using LinkedHashSet
 LinkedHashSet set = new LinkedHashSet();
 set.addAll(li1);
        System.out.println("List is:"+ li1);
        System.out.println("LinkedSet is:"+set);

        System.out.println("Length of List :"+ li1.size());
        System.out.println("Length of Set:"+ set.size());
        int dupCount= li1.size()- set.size();
        System.out.println("Total duplicate Count :"+dupCount);

//Duplicate Finder//
        System.out.println();
 List<String> fruits = List.of("apple","orange","banana", "apple", "banana");
 Set<String> setFruits = new HashSet<String>();
  for (String fruit:fruits) {
      System.out.println("Fruit is : "+fruit );
      if (!setFruits.add(fruit)) {
          System.out.println("Item is NOT added :"+fruit);

      }

  }
        System.out.println("Set is"+setFruits);
        System.out.println(15);
}
}