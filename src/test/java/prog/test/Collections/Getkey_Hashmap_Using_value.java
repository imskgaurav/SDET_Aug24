package prog.test.Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import java.util.Set;

public class Getkey_Hashmap_Using_value {


    public static void main(String[] args) {
        // create a hashmap
        Map<String , Integer> numMap = new HashMap();
        numMap.put("ONE" ,1);
        numMap.put("TWO" ,2);
        numMap.put("THREE" ,3);
        numMap.put("TEN" ,10);
        System.out.println(numMap);
        //values which keys to Search lets  :10

        Integer i= 10;

       Set<Map.Entry<String, Integer>> s1=  numMap.entrySet();
        System.out.println(s1);
        Iterator<Map.Entry<String, Integer>> it = s1.iterator();

        while(it.hasNext()){
          Map.Entry e  =(Map.Entry) it.next();

            System.out.println(e.getValue());
            System.out.println(e.getKey());

            if(e.getValue().equals(10)){

                System.out.println(e.setValue("1000"));

            }


        }

        System.out.println(numMap);

    }
}
