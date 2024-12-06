package com.java.concurrency;


import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapEx {

    public static void main(String[] args) {

        ConcurrentHashMap<String, Integer> map1= new ConcurrentHashMap<>();

        map1.put("A", 65);

        map1.put("B", 67);

        map1.put("Z", 90);

        System.out.println("Value is :"+map1.get("A"));

    }
}
