package prog.test.Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Setiterate {

    public static void main(String[] args) {
        Set<String> fruits = new HashSet<String>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");
        Iterator<String> itr = fruits.iterator();
        while(itr.hasNext()){
            System.out.print(" "+itr.next());
        }
        System.out.println();
        System.out.println("Enhanced For Lopp");
//Using Enhanced For-Loop

        for(String s : fruits){
            System.out.println(s);
        }

       // Using Stream API
        System.out.println("Stream API");
        fruits.stream().forEach(System.out::println);

    }
}
