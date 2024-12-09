package com.java.ashokIT;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ArmStrongNumberCheck {

    //*153 = 1*1*1 + 5*5*5 + 3*3*3 = 1+125+27 =153//

    public static void main(String[] args) {
        boolean f = checkArmStrongNumber(1634);
        System.out.println(f);

    }


    public static boolean checkArmStrongNumber(int num) {
        boolean flag = false;
        int oriNum = num;
        int sum = 0;

        while (num !=0) {

            int rem = num % 10;

            num = num / 10;

            sum = sum + (int) Math.pow(rem, 3);

        }
        System.out.print("Total Sum is :" + sum);
        if (sum == oriNum) {
            System.out.printf("Sum is " + sum);
            return true;
        } else {
           // flag =false;
            return flag;
        }
    }
}
