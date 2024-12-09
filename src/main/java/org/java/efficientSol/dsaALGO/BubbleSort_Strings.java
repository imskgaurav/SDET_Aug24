package org.java.efficientSol.dsaALGO;


public class BubbleSort_Strings {

    //https://beginnersbook.com/2019/04/java-program-to-perform-bubble-sort-on-strings/
    public static void main(String[] args) {
   String str = "apple";
         bubbleSort(str);

    }
    private static void swapChar(char[] arr, int i, int j) {
        char tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public  static String bubbleSort(String str) {
      StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < str.length(); i++) {
            //Inner Loop for comparing each Element Till list index. comparing current with Next//
            for (int j = 0; j < str.length()-i-1; j++) {
                //System.out.println(str.charAt(j));
                if(sb.charAt(j)>sb.charAt(j+1)){
                    System.out.println("Not is Ascending");
                    char temp =sb.charAt(j) ;
                   // sb.charAt(j)=sb.charAt(j+1);
                    sb.setCharAt(j,sb.charAt(j+1));
                    sb.setCharAt((j+1), temp);
                }
                System.out.println("After Swapping");
                System.out.println(sb.charAt(j));
                System.out.println(sb.charAt(j+1));

            }
            System.out.println(sb);

        }
        return sb.toString();
    }
}
