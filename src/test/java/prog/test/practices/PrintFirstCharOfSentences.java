package prog.test.practices;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class PrintFirstCharOfSentences {

    public static void main(String[] args) {

        String input= "Geeks for java programs";
         String xx= "A Computer Science Portal for Geeks";
        String regEx= "\\b[a-zA-Z]";
        Pattern p = Pattern.compile(regEx);
        Matcher m= p.matcher(xx);
        int count =0;
        while (m.find()){
            count++;
            System.out.print(m.group());
        }
        System.out.print("\n");
        System.out.println("While Loop Completed");
        System.out.println(count);


    }
}
