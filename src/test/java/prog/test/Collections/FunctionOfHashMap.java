package prog.test.Collections;

import java.util.*;

public class FunctionOfHashMap {


    public static void main(String[] args) {


        Map m =  new HashMap();

        m.put("Durga", "200");
        m.put("Shiva", "400");
        m.put("Ganesh", "600");
        m.put("Karthik", "700");
        System.out.println(m);

        System.out.println(m.put("Ganesh", "300"));
        System.out.println(m);
        System.out.println(m.keySet());
         Collection cc=  m.values();

        System.out.println(cc);
  // Entry Set
      Set s1=   m.entrySet();
        System.out.println(s1);
        //Iterating on Entry Set
        Iterator it = s1.iterator();

        while (it.hasNext()){
            Map.Entry e=    (Map.Entry)it.next();
            System.out.println(e.getKey());
            System.out.println(e.getValue());


        }

    }
}
