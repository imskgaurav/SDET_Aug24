package org.java.dsaTwoPointer;

public class CheckIfStringIsPalindrome {

    public static void main(String[] args) {

     boolean res= isPalinDrome("raceffcar");
        System.out.println("Result :"+res);

    }

    static boolean isPalinDrome(String s){
        if(s.isEmpty()){

        return false;
        }
         char arr[]= s.toCharArray();
         int left =0;
         int right =arr.length-1;
          while(left<right){
              if(s.charAt(left)!=s.charAt(right)){
                  System.out.println("Condition Failed at index:"+left);
                return false;
              }
              left++;
              right--;
         }


        return true;
    }
}
