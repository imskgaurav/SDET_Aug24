package com.java.princeAutomation;

import java.util.Stack;

public class BalancedParenthesisString {


    public static void main(String[] args) {
        String parenthesis = "{([])}";
        char [] chArr= parenthesis.toCharArray();
        Stack<Character> stack1= new Stack<>();
        int len = parenthesis.length();
       boolean flag = true;
        if(len%2!=0){
            System.out.println("Not A balanced Parenthesis");
         return;
        }
        for(int i=0; i<chArr.length; i++){
           char ch = parenthesis.charAt(i);
            if((ch=='{') ||(ch=='(')||(ch=='[')){
                stack1.push(ch);
            }
            else if(!stack1.isEmpty()){
                if((ch=='}' && stack1.peek()=='{')||(ch==']' && stack1.peek()=='[')||(ch==')' && stack1.peek()=='(')){

                    stack1.pop();
                }
            }
            else{
                System.out.println("Empty stack");
                flag= false;
            }

        }

        if(stack1.isEmpty()&&flag==true){

            System.out.println("Balanced Paremthese");
        }
        else{

            System.out.println("Not a balannced Parenthesei");
        }

    }
}
