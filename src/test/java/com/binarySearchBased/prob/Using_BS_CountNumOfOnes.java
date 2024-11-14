package com.binarySearchBased.prob;

public class Using_BS_CountNumOfOnes {
    //https://www.geeksforgeeks.org/count-1s-sorted-binary-array/
    //https://www.youtube.com/watch?v=2Yy9rKwkE7g
   /* Binary Approach : Since the input array is sorted, we can use Binary Search to find the first occurrence of 0.
    Once we have index of first element, we can return count as n – index of first zero. */
    public static void main(String[] args) {
        int arr[] = {1, 1, 1, 0, 0, 0, 0};
        int res = countsOnes(arr, 7);
        System.out.println(res);
    }

    static int countsOnes(int arr[], int size) {
        int low = 0;
        int high = size - 1;
        //Mid calculate :

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == 0) {
                // Its means mid =0 ; so travel in  1st half;and low will be same , high will be change
                high = mid - 1;
            } else {
                //This loop will assume mid value is 1.  Now we will check , next elment from this mid , if it 0, or last element , we found the last 1 in the series
                if (arr[mid + 1] == 0 || mid == (size - 1)) {
                    // Search in 2nd Half
                    return (mid + 1);
                } else {
                    // we found the 1 , but after this there is one more 1.

                    low = mid + 1;

                }

            }

        }
        return 0;
    }
}
