package com.java.LearnInheritance;

public class MethodOverLoading {

    // maintain multiple version of method in same
    // class is called method OverLoading */
    public static void main(String[] args) {
        testMethodOverLoading t1= new testMethodOverLoading();

        double z=    t1.sum(78.88, 8.5);

        System.out.println(z);

    }



}

class testMethodOverLoading{

    public int sum(int x, int y){

        int sum = x+y;

        return sum;
    }

    public int sum(double x, int y){

        int sum = (int)x+y;

        return sum;
    }

    public double sum(double x, double y){

        double sum = x+y;

        return sum;
    }

    public  double  sum(int x, byte y, double z){

        double sum = x+y+z;

        return sum;
    }

}
