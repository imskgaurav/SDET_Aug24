package prog.test.Collections;

import java.util.Arrays;
import java.util.HashSet;
import  java.util.Set;


public class SetToArrayExample {

    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>(Arrays.asList("Apple", "Banana", "Mango", "Orange"));

        String fruitsArr [] = fruits.stream().toArray(String[]::new);
        System.out.println("Array from Set "+Arrays.toString(fruitsArr));
    }
}
