package com.java.ReProgram;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class NumberTrianglePattern {

    /*
     * 1
     * 2 2
     * 3 3 3
     * 4 4 4 4
     * 5 5 5 5 5
     * 6 6 6 6 6 6
     */
    public static void main(String[] args) {
        int count =6;
        //For each iteartion of row : Value of row initialised once, and for one value of i,
        // we control column count//
        for (int row=1; row<=count; row++){

            for(int col=1; col<=row; col++) {
                //System.out.print(row+" ");
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
}
