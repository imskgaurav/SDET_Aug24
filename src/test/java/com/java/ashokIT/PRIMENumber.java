package com.java.ashokIT;

public class PRIMENumber {

    //https://www.geeksforgeeks.org/why-do-we-check-up-to-the-square-root-of-a-number-to-determine-if-that-number-is-prime/
    public static void main(String[] args) {
        boolean y =isPrimeNumber(29);
        System.out.println(y);

    }

  /*   public static boolean checkPrimeNumber(int num) {
        boolean flag = true;
        if (num == 1) {
            return false;
        }
        for (int i = 3; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                System.out.println("Found True for :"+i);
                flag = false;
            } else {
                flag = true;
            }
        }
        return flag;
    }*/

    static boolean  isPrimeNumber( int num){
        boolean isPrime =true;
        for (int j =2; j*j<=num; j++){
            if(num%j==0){
                System.out.println("Number is Divisbile by :"+j);
               isPrime= false;
            }

        }
     return isPrime;
    }

}

