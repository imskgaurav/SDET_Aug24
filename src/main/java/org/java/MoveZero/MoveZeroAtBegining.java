package org.java.MoveZero;

import org.openqa.selenium.devtools.v127.storage.model.AttributionReportingAggregatableResult;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MoveZeroAtBegining {

    public static void main(String[] args) {
        int [] nums = {1,0,3,0,12,0};
      int [] res=  moveZeroAtStart(nums);
        System.out.println("Array is:"+ Arrays.toString(res));
    }

    static  int [] moveZeroAtStart(int arr[]){
        int len= arr.length;
        int insertPos= 0;
        int count=0;
        int nonZero [] = new int[len];
        for(int i=0; i<len; i++){
            if(arr[i]==0){
                arr[insertPos]= arr[i];
                System.out.println("Position occupied is :"+insertPos +"For index "+i);
                insertPos++;

            }
            else {
                System.out.println("Non Zero Value Found :"+arr[i]);
               nonZero[count]= arr[i];
               count++;
            }

        }
        System.out.println("New ARRRAY "+Arrays.toString(nonZero));


     return arr;
    }
}
