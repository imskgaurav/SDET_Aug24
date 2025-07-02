package com.engineeringDigest.collectionTutorials;

import io.qameta.allure.Link;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> ll= new LinkedList<>();
        ll.add(1);
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(-5);
        System.out.println("Linked List :"+ll);
        Iterator<Integer> ltr = ll.iterator();
        while(ltr.hasNext()) {
            System.out.println("Elements are :" + ltr.next());
        }
      int mm=  ll.get(0);

        System.out.println("By using :"+mm);
        ll.addFirst(88);
        ll.addLast(99);
        System.out.println("After AddFirst Operation:"+ ll);
        System.out.println("First Element is :"+ll.getFirst());
        System.out.println("last Element is :"+ll.getLast());

         boolean b= ll.remove(Integer.valueOf(88));

        System.out.println("Removed successfully :"+b);
        int removedElm= ll.remove(0);
        System.out.println("Removed From List:"+removedElm);
        System.out.println("Linked List :"+ll);


    }
}
