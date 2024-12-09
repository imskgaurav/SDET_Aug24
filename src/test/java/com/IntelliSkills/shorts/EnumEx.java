package com.IntelliSkills.shorts;

public class EnumEx {
    public static void main(String[] args) {

        Season se=Season.getSeason(2);
        System.out.println(se);
    }
}

enum Season{
    WINTER, SPRING, SUMMER,FALL;
    static Season getSeason(int index){

        return Season.values()[index];

    }
}
