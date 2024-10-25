package com.IntelliSkills.shorts;

import java.util.HashMap;

public class HashMap_P1 {

    public static void main(String[] args) {

        HashMap<String, Integer> map= new HashMap<>();

        map.put("A", 1);
        map.put("e", 2);
        map.put(null, -7);

        System.out.print(map.get(null));
    }
}
