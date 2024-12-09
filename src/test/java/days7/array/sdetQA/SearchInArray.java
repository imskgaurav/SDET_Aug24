package days7.array.sdetQA;

import org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STAlgType;

public class SearchInArray {

    public static void main(String[] args) {

        int[] arr = new int[]{55, -8, 44, 88, 2, 77};

        int index = findElmInArray(arr, 2);
        System.out.printf("Index Value is :" + index);
    }


    public static int findElmInArray(int arr[], int target) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i]==target){
                return i;
            }

        }
  return -1;

    }
}