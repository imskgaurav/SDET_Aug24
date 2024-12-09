package com.dsaString.HackerRank;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Arrays;

public class Check_Pangram_Sol {

    static String sen = "The quick brown fox jumps over the lazy dog";

    public static void main(String[] args) {
        sen = sen.toLowerCase();

        int count [] = new int[26];

        for(int i =0; i<sen.length(); i++){

            char c = sen.charAt(i);

            if(Character.isAlphabetic(c)){

                int x = c-'a';
                System.out.println(x);
                count[x]= count[x]+1;
            }else{

                int space=(int) c;
                if(space==32) {
                    System.out.println("Character is Space");
                }else{

                 return;
                }
            }

            }
        System.out.println(Arrays.toString(count));

        for(int i=0;i<count.length; i++){

            if(count[i]>=1){
                System.out.print("PANGRAM");

            }
            else{

                System.out.println("NO");
            }
        }
        }

    }
