package com.IntelliSkills.shorts;

public class VarArgJava {

    public static void main(String[] args) {
        show();

        show(7,8,6);

    }

    static  void show(int... a){

        for( int z:a){
            System.out.println("Value is :"+z);
        }
    }
}
