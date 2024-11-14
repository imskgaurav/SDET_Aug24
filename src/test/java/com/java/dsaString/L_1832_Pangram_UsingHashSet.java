package com.java.dsaString;

import net.bytebuddy.dynamic.scaffold.MethodGraph;

import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.*;

public class L_1832_Pangram_UsingHashSet {

    public static void main(String[] args) {
        String pan= "Pack my box with five dozen liquor jugs";
       boolean res =checkIfPangram(pan);
        System.out.println(res);

    }

    static boolean checkIfPangram(String str){
        str= str.toLowerCase().trim();
        boolean flag=false;
      if(str.length()<26){
       return flag;
      }

      // Create a HashSet of  all Charaacter from a to z;
      Set<Character> albhabetSet = new LinkedHashSet<>();

      for(int i ='a'; i<='z'; i++){
          albhabetSet.add( (char) i);

      }
        System.out.println(albhabetSet);

      for(int i =0; i<str.length(); i++){

          char c = str.charAt(i);

          albhabetSet.remove(c);

      }

        System.out.println(albhabetSet);
      if(albhabetSet.isEmpty()){

          flag= true;
      }
     return flag;
    }
}
