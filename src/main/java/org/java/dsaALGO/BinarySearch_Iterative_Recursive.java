package org.java.dsaALGO;

public class BinarySearch_Iterative_Recursive {


    public static void main(String[] args) {


    }

    static int  binarySearch_Iterative(int arr[], int target) {
        //declare variable low /high and index .
        int low =0;
        int high= arr.length-1;
        int mid =0;
        while(low<=high){
            mid = low+(high-low)/2;
            // Check if x is present at mid
            if(arr[mid]==target)
             return mid;
            //  If target is greater,ignore left half:
            if(arr[mid]<target)
                 low = mid+1;
            else
                // If target  is smaller, ignore right half
                 high= mid-1;
        }

    return -1;
    }
}