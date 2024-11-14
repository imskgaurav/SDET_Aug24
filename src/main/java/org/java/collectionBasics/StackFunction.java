package org.java.collectionBasics;

import org.slf4j.IMarkerFactory;

import java.util.Stack;
import java.util.List;

public class StackFunction {
    //The Stack class represents a last-in-first-out
    // (LIFO) stack of objects
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.add(9);
        stack.add(99);
        stack.add(88);
        stack.add(02);
        stack.add(01);

        System.out.println(stack);
        stack.pop();
        System.out.println(stack);

        // Push elements onto the stack

      Stack<String> st1= new Stack<>();
      st1.push("Surya");
        st1.push("Tilak");
        st1.push("Akshar");
        st1.push("Sanju");
        System.out.println(st1);
        System.out.println(st1.pop());
        System.out.println(st1);

        // // Pop elements from the stack
         while(!st1.isEmpty()){

             System.out.println(st1.pop());
         }
        st1.setSize(10);
        System.out.println(st1);
        System.out.println(st1.pop());


    }
}
