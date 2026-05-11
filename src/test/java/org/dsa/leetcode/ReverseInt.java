package org.dsa.leetcode;

//https://leetcode.com/problems/reverse-integer/
public class ReverseInt {

    public static void main(String[] args) {
        int x = 1534398347;
        int res= reverse(x);
        System.out.println("Reversed Integer is :"+res);

    }

    static int reverse(int x) {
        long rev=0;
        while(x!=0){
            int pop = x%10;
            rev= rev*10+pop;
            x =x /10;
        }
        if(rev>Integer.MAX_VALUE || rev<Integer.MIN_VALUE) {
            return 0;
        }
        return (int)rev;
    }

}
