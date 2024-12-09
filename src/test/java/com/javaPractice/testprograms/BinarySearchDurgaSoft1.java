package com.javaPractice.testprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearchDurgaSoft1 {
     public static void main(String[] args) {
        
    String arr[] = {"Z", "A", "M", "K", "a"} ;

    List<String> list = new ArrayList<String>(Arrays.asList(arr));
    System.out.println(list);
    Collections.sort(list);

    int index =Collections.binarySearch(list, "M");
    System.out.println(index);

     }
}
