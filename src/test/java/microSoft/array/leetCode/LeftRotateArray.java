package microSoft.array.leetCode;

import java.util.Arrays;

public class LeftRotateArray {
    // arr[] = {1, 2, 3, 4, 5, 6}, d = 2.
    //Frst Step:
    //  => Rotate to left by one position.
    //        => arr[] = {2, 3, 4, 5, 6, 1}
    //Second Step:
    //        => Rotate again to left by one position
    //        => arr[] = {3, 4, 5, 6, 1, 2}
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6};

        rotateArrayBykPosition(a, 2);
        System.out.println(Arrays.toString(a));

    }

    public  static  void rotateArrayBykPosition(int [] a, int k){
        int size= a.length;
        if(k>size) {
            k = k %size;
        }
        // Reverse the first k elements
        reverseArrayUsingTwoPointerApproach(a, 0, k-1);
        // Reverse the remaining n-d elements
        reverseArrayUsingTwoPointerApproach(a, k, size-1);
        // Reverse the entire array
        reverseArrayUsingTwoPointerApproach(a, 0, size-1);

    }

    public static int [] reverseArrayUsingTwoPointerApproach(int [] arrA, int left, int right){
        while(left<right){
            int temp= arrA[left];
            arrA[left]= arrA[right];
            arrA[right]= temp;
            left++;
            right--;
        }
        return arrA;
    }


}
