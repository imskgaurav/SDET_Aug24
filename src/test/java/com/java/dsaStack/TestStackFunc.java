package com.java.dsaStack;

import java.util.Stack;

public class TestStackFunc {

    public static void main(String[] args) {

        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.pop());
        System.out.println(stack.peek());

    }
}
