package com.engineeringDigest.collectionTutorials;

/*https://www.youtube.com/watch?v=XgF7XNLNf38&t=959s */
import java.util.*;

 class MyComparator implements  Comparator<Integer>{

    //5 ,3
    @Override
    public int compare(Integer o1, Integer o2) {
        return  o2- o1;
    }
}

class StringLenComparator implements  Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        return o2.length()- o1.length();
    }
}


public class ComparatorDemoEx1 {
    public static void main(String[] args) {
        List<Integer> list1= new ArrayList<>();
        list1.add(-7);
        list1.add(7);
        list1.add(4);
        list1.add(33);
         list1.sort(null);
         // Natural Sorting Ascending Order
        System.out.println(list1);
        //Use case1: Sort the Integer List in Descending Order: Now we have to write our own logic//
        list1.sort(new MyComparator());


        System.out.println("Descending order :"+list1);
        // Let us Try for String List, Sort function by default  will do the Sorting with alphabetic orders//

        List<String> strList = Arrays.asList("custard apple","berries","date", "apple");
        strList.sort(null);
        System.out.println(strList);

     // Use case2 : Sort the strList with lengths of words */

        strList.sort(new StringLenComparator());

        System.out.println("String lenght compare and arrange in Descending Order :"+strList);


    }


}
