package microSoft.array.leetCode;

import java.util.Arrays;
import java.util.List;

public class MasterCardProg1 {

    static String value = "8,9,10,45,788,2,4,9";

    public static void main(String[] args) {

        sortValues(value);

     int res=   changeOneCharValToInt('9');
        System.out.print("Digit is:"+ res);
    }

    public static void sortValues(String val) {
        // , is sepeartor , so we need to seperate with ,
        String[] strArr = val.split(",");
        int len = strArr.length;
        int num[] = new int[len];
        for (int i = 0; i < len; i++) {
            num[i] = Integer.parseInt(strArr[i]);
        }
        System.out.println( Arrays.toString(num));
    }

    static  int changeOneCharValToInt(char c){
      // Its applicable for '0'  to '9';;;
         int realVal=0;
        if(Character.isDigit(c)){

           realVal= c-48;

        }
        return realVal;
    }
}