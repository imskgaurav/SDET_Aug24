package org.multithread.java;

public class TeluskoExample {
    //Synchronized keyword
    //https://www.youtube.com/watch?v=RH7G-N2pa8M

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
      /*  counter.increment();
        counter.increment();
        counter.increment();*/
        Thread t1= new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i =1;i<=1100; i++ ){

                    counter.increment();
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int k =1; k<=1000; k++ )  {

                    counter.increment();
                }
            }
        }) ;
        t1.start();
        t2.start();
        // t1 is running  for its for loop : meanwhile main Thread is asking for count //
        //HENCE both Thread t1 & main thread are not in sync,..To solve this problem we can use
        // join function of thread classs

        t1.join();

      // Now create one more thread :




      t2.join();
        System.out.print("Count val is :"+counter.count);
    }


}

class Counter{

    int count;

    public synchronized void increment(){

        count++;

    }
}