package com.java.dsaString;

public class ReplaceMethod {

    public static void main(String[] args) {

        String inp= "I love Python Programming Python";

        inp=inp.replace("Python", "JAVA");
        System.out.println(inp);

        String st= "I am eating fruits with 99ftruits";
        st =st.replaceAll("\\^[a-z]]", "Java");
        System.out.print(st);


    }
}
