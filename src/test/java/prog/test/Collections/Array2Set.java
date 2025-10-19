package prog.test.Collections;

import java.util.HashSet;
import java.util.Set;

public class Array2Set {
    public static void main(String[] args) {
        int[][] numbers = {
                {1, 2, 3},
                {4, 2, 5},
                {6, 3, 7}
        };

        int len = numbers.length;
        Set<Integer> set= new HashSet<>();
        for(int i =0; i<len; i++){
            for(int j=0; j<len; j++){
                System.out.println("Current Value is :"+numbers[i][j]);
                if(set.contains(numbers[i][j])){
                    System.out.println("Duplicate Number");
                }
                else{
                    set.add(numbers[i][j]);
                }
            }
        }


      set.stream().forEach(System.out::println);
    }
}
