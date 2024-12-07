package prog.test.Collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class HashMapPrint1 {
    public static void main(String[] args) {
        Map<String, String> hmap1 = new LinkedHashMap<>();
        System.out.println(hmap1.isEmpty());
        hmap1.put("India" , "New Delhi");
        hmap1.put("England", "London");
        hmap1.put("Germany", "Berlin");
        hmap1.put("Norway", "Oslo");
        hmap1.put("USA", "Washington DC");
        hmap1.put( "Canada","Ottawa");
        hmap1.put(null, "Kailasha");
        hmap1.putIfAbsent("UK","London");
        hmap1.putIfAbsent("Srilanka","Colombo");

        System.out.println(hmap1);
        System.out.println("Checking HashmAP function");
        // containsKey and  containsValue
        System.out.println(hmap1.containsValue("Oslo"));
        System.out.println(hmap1.containsKey("Canada"));
        //Remove the Keys, Value will be return //

       String s1= hmap1.remove("Germany");
        System.out.println(s1);
        System.out.println(hmap1);

        //Remove key Values//

        boolean xx= hmap1.remove("Canada", "Ottawa");
        System.out.println(xx);
        System.out.println(hmap1);

        //Iterate through keySet //
        for(String s: hmap1.keySet()){
            System.out.println(s);
            System.out.println(hmap1.get(s));
        }

        //UsIng Entry Interface: and EntrySet

        for(Map.Entry<String, String> e: hmap1.entrySet()){

            System.out.println(e.getKey()+ e.getValue());

        }

        // CHANGE value to UPPERCASE
        for(Map.Entry<String , String>   entry : hmap1.entrySet()) {

               entry.setValue(entry.getValue().toUpperCase());
        }

        System.out.println("Print HashMap :"+ hmap1);

    }
}
