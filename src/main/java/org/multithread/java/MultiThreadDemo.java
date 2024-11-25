package org.multithread.java;

public class MultiThreadDemo {


    //https://www.youtube.com/watch?v=pN7MGyMv2jc
    public static void main(String[] args) {

        MyThread t = new MyThread();
        t.start();

        for (int k =0; k<=10; k++){

            System.out.print("This is Main method Thread");
        }

    }
}

class MyThread extends Thread{


    //Task of the Thread
    public void run(){

        for (int i=0;i<=10;i++){

            System.out.println("Child THREAD");
        }

    }


}
