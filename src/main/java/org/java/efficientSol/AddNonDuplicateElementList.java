package org.java.efficientSol;

import java.util.ArrayList;
import java.util.List;
// /Adding Non-Duplicate Element in List//
public class AddNonDuplicateElementList {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();

        int arr[] = {8,9,8, 99, 0, 33, 4, 8,9, 4};

        for(int i=0; i<arr.length;i++){

            if(!list.contains(arr[i])){

                list.add(arr[i]);
            }
        }

        System.out.println("List is :"+ list);
    }


}
