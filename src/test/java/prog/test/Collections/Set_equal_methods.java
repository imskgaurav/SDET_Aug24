package prog.test.Collections;

import java.util.HashSet;

import java.util.Set;

public class Set_equal_methods {

    public static void main(String[] args) {

        Set<String> set1 = new HashSet<>();

        set1.add("Java");
        set1.add("Python");

        Set<String> set2 = new HashSet<>();
        set2.add("Python");
        set2.add("Java");

        System.out.println(set1.equals(set2));

    }
}
