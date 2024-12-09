package org.java.dsaALGO;

public class BinarySearch {

 /*  Binary Search Algorithm in Java
    Below is the Algorithm designed for Binary Search:
    Start
    Take input array and Target
    Initialise start = 0 and end = (array size -1)
    Intialise mid variable
            mid = (start+end)/2
if array[ mid ] == target then return mid
if array[ mid ] < target then start = mid+1
if array[ mid ] > target then end = mid-1
            if start<=end then goto step 5
            return -1 as Not element found
    Exit
*/
    /*  120 -> 60 ->30 -> 15 ->7.5(8) -> 4
     *  N --> N/2, N/2 , N/2*(1/2),  (N/16) :::> N/2^K */
    // k = log2(n)

    public static void main(String[] args) {
        //Find the Index of Target Element
        int a[] = {2, 3, 4, 10, 40, 60};
        binarySearchInAscOrderArr(a, 10);
    }

    static void binarySearchInAscOrderArr(int[] arr, int target) {
        int index = -1;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + ((end - start) / 2);
            if (arr[mid] == target) {
                index = mid;
                System.out.println("Found the element at index :" + index);
                break;
            } else if (arr[mid] < target) {
                // It means Target lies in Second HALF //
                start = mid + 1;

            } else {
                //Target lies in First Half . Hence start point same and end Point will be mid-1
                end = mid - 1;
            }

        }
        if (index == -1) {

            System.out.println("Element NOT found");
        } else {

            System.out.println("Elememt Found " + target + " at index :" + index);
        }


    }

    public static void binarySearchForDescOrderArr(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        int index = -1;

        while (start <= end) {
            int mid = start + ((end - start)) / 2;
            if (arr[mid] == target) {
                index = mid;
            } else if (arr[mid] < target) {
                //Target is Greater than Mid, Since Array is in Descending Order, so we need to search in 1st Half//
                end = mid - 1;
            } else {
                //Target is less than mid : Need to check in 2nd Half, so chnage start point
                start = mid + 1;

            }
        }
    }
}