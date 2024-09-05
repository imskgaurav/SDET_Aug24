package prog.test.practices;

import  java.util.HashMap;
import java.util.Map;
public class PrintHashMapUsingJava8 {
    public static void main(String[] args) {
        String str = "aaabbbcc";
        Map<Character, Integer> map1= new HashMap<>();
        for (int i =0; i<str.length(); i++){
               char c= str.charAt(i);

              if(map1.containsKey(c)){
              map1.put(c, map1.get(c)+1);
        }
        else{
             map1.put(c,1);

            }

    }
  System.out.println(map1.toString());
        map1.forEach((key,value)-> System.out.print(key+""+value));
}
}