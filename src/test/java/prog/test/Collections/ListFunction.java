package prog.test.Collections;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;

import java.util.Collections;

public class ListFunction {

    //Test all method : add(index), add(index, Obj), set(index, Obj)
    //  indexOf(Obj),  lastIndexOf(obj)
    public static void main(String[] args) {
        List<Character> l1 = new ArrayList<Character>();
        l1.add('A');
        l1.add('B');
        l1.add('C');
        System.out.println(l1);
        System.out.println(l1.get(2));
        System.out.println(l1.indexOf('E'));
        l1.add(3, 'E');
        System.out.println(l1);
        System.out.println(l1.indexOf('E'));
        //l1.set(4, 'I');
        System.out.println(l1);
        Integer ii = l1.indexOf('E');
        System.out.println(ii);
      ///Fixed Size List
        List<Character> l2= Arrays.asList('a', 'E', 'I', 'o', 'u');
        //addAll method
        //l2.addAll(l1); // Fixed Size List is crreated with Arrays.asList();we cannot add in l2

        l1.addAll(l2);

        System.out.println(l1);
        System.out.print(l1.indexOf('a'));

        //Initialised ArrayList with  constructor// hen, we can add/remove elements to/from the newly constructed list:
      List<String> strList= new ArrayList<String>(Arrays.asList("Ram", "Hanuman"));
      strList.add("SITAA");
      strList.add(3, "LAXMAN");
      System.out.println(strList);
    }
}
