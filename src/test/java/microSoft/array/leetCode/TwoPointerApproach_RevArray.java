package microSoft.array.leetCode;

import java.util.Arrays;

public class TwoPointerApproach_RevArray {

    public static void main(String[] args) {

        int[] arr = { 1, 4, 3, 2, 6, 5 };
        int [] revArr= new int[arr.length];
        revArr =reverseArrayUsingTwoPointerApproach(arr);
        System.out.println(Arrays.toString(revArr));


    }
    public static int [] reverseArrayUsingTwoPointerApproach(int [] arrA){
        int left =0; int right = arrA.length-1;
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
