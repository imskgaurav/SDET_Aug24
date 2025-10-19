package org.java.dsaTwoPointer;

//Here's a simple two pointer approach example in Java -
// finding if a pair exists in a sorted array that sums to a target:
public class FindPairSumInSortedArray {
    public static int[] findPairWithSum(int[] arr, int target) {
        if (arr == null || arr.length < 2) return null;
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                return new int[] { arr[left], arr[right] };
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] sortedArray = {1, 5,7, 8,10};
        int target = 12;

        int[] pair = findPairWithSum(sortedArray, target);
        if (pair != null) {
            System.out.println("Pair found: " + pair[0] + " + " + pair[1] + " = " + target);
        } else {
            System.out.println("No pair found for target " + target);
        }
    }
}
