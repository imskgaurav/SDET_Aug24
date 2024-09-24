package prog.test.Collections;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {

    static String input = "pprraaveen";
    public static void main(String[] args) {
        Map<Character, Integer> map1= new HashMap();
        for (int i =0; i<input.length(); i++){
               Character c =input.charAt(i);
              if(map1.containsKey(c)){
                  map1.put(c, map1.get(c)+1);
              }
              else{
                  map1.put(c, 1);
              }

        }
      System.out.println(map1);
    }

}
