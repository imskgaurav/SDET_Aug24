package prog.test.practices;

import  java.util.Map;
import java.util.LinkedHashMap;

public class NonRepeatingCharFromString {
    public static void main(String[] args) {
    String str = "pepcoding";
    int k=findNonRepeatingCharIndexFromString(str);
    System.out.println(k);

    System.out.println(str.charAt(k));
    }

    public static int findNonRepeatingCharIndexFromString(String str){
           int index =0;
            Map<Character, Integer>map1 = new LinkedHashMap<Character, Integer>();

            for(int i =0; i<str.length(); i++){

                char c = str.charAt(i);
                if(map1.containsKey(c)){

                    map1.put(c, map1.get(c)+1);
                }

                else{

                    map1.put(c,1);
                }
            }
System.out.println(map1);
            for(int i =0; i<str.length(); i++){
                System.out.println("Iterating HashMap");
               char c = str.charAt(i);
               int m =map1.get(c);
                System.out.println(m);
               if(m==1){
                   index =i;
                   System.out.println("iNDEX is:"+index);
                   return index;
             }
         }
  return -1;
    }
}
