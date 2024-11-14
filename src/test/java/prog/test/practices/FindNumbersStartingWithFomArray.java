package prog.test.practices;

import java.util.ArrayList;
import java.util.List;

public class FindNumbersStartingWithFomArray {

    public static void main(String[] args) {
        int arr [] = {23, 121, 11, 541, 311, 11111, 13333, 761};
        System.out.print( getfirstDigit(arr));
    }




    public static List<Integer> getfirstDigit(int arr[]){
        List<Integer> al = new ArrayList<>();
         int num=0;
        for (int j =0;j<arr.length; j++){
            num= arr[j];
            while (num>=10){
                num= num/10;
            }
            System.out.println(num);
            if(num==1){
                al.add(arr[j]);
            }
        }

       // System.out.println(al);
    return  al;
    }

}
