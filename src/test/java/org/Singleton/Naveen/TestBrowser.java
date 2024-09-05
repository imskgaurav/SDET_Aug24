package org.Singleton.Naveen;

public class TestBrowser {

    public static void main(String[] args) {
        //Browser br = new Browser();//
     ;

            Runnable task = ()-> { Browser.getInstance().display();};

            Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        Thread t3 = new Thread(task);
        Thread t4 = new Thread(task);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
      // wait for all thread to complete/die
        try{
       t1.join();
       t2.join();
       t3.join();
       t4.join();


        }
        catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}
