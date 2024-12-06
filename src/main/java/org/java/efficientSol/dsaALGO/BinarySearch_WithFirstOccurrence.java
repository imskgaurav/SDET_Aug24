package org.java.efficientSol.dsaALGO;

public class BinarySearch_WithFirstOccurrence {

    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 10,10,10,40 };
       binarySearchFirstOccurrence(arr, 10, false);

    }

    static void binarySearchFirstOccurrence(int [] inp, int target , boolean isFirst){
    // Array is in Ascending order //
     int index =-1;
     int start =0;
     int end = inp.length-1;
     while(start<=end){
         int mid =start+ (end- start)/2;
       if(inp[mid]==target){
        index= mid;
        if(isFirst){
        // So if its First Occurrence :
            end = mid-1;
        }
        else{
           start= mid+1;
        }
    }
    else if(inp[mid] <target){
          start = mid+1;
    }
    else {
        end =  mid-1;
    }
     }
     if(index==-1){
         System.out.print("Element Not Found");
     }
      else {
         System.out.print("found at Index:"+index);
     }
    }
}
